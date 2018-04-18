package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ComboBoxPanel extends JPanel {
	
	// this model automatically updates the shape selection menu when switching between 3D and 4D
	private DefaultComboBoxModel<String> shapeList;
	private final String[] SHAPES3D = {"Tetrahedron", "Cube", "Octahedron", "Dodecahedron", "Icosahedron"};
	private final String[] SHAPES4D = {"5-Cell", "8-Cell", "16-Cell", "24-Cell"};
	
	private DisplayPanel parent_displayPanel;
	private MainWindow parent_mainWindow;
	private JComboBox<String> comboBox_dimension, comboBox_shapeSelection;
	
	/**
	 * Create the panel.
	 */
	public ComboBoxPanel(MainWindow mw, DisplayPanel dp) {
		
		this.parent_mainWindow = mw;
		this.parent_displayPanel = dp;

		shapeList = new DefaultComboBoxModel<>();
		for(String s : SHAPES3D)
			shapeList.addElement(s);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {50, 50, 50, 50};
		gridBagLayout.rowHeights = new int[] {20};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{};
		setLayout(gridBagLayout);
		
		SelectionListener selectionListener = new SelectionListener();
		
		comboBox_dimension = new JComboBox<>(new DefaultComboBoxModel<String>(new String[]{"3D", "4D"}));
		comboBox_dimension.addActionListener(selectionListener);
		GridBagConstraints gbc_comboBox_dimension = new GridBagConstraints();
		gbc_comboBox_dimension.fill = GridBagConstraints.BOTH;
		gbc_comboBox_dimension.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_dimension.gridx = 0;
		gbc_comboBox_dimension.gridy = 0;
		add(comboBox_dimension, gbc_comboBox_dimension);
		
		comboBox_shapeSelection = new JComboBox<>();
		comboBox_shapeSelection.setModel(shapeList);
		comboBox_shapeSelection.addActionListener(selectionListener);
		GridBagConstraints gbc_comboBox_shapeSelection = new GridBagConstraints();
		gbc_comboBox_shapeSelection.fill = GridBagConstraints.BOTH;
		gbc_comboBox_shapeSelection.gridwidth = 3;
		gbc_comboBox_shapeSelection.gridx = 1;
		gbc_comboBox_shapeSelection.gridy = 0;
		add(comboBox_shapeSelection, gbc_comboBox_shapeSelection);
	}
	
	protected void initSelections(){

		comboBox_dimension.setSelectedItem("3D");
		comboBox_shapeSelection.setSelectedItem("Tetrahedron");
	}

	private class SelectionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			
			/* 	comboBox_shapeSelection is updated and new selection is made automatically after removing all elements from the model,
			 * 	so check that there is an element in the model before attempting to update the graphicsPanel
			*/
			if(e.getSource() == comboBox_shapeSelection && shapeList.getElementAt(0) != null){
				
				String selectedShape = (String) comboBox_shapeSelection.getSelectedItem();
				parent_displayPanel.setShape(selectedShape);
			}
			else if(e.getSource() == comboBox_dimension){
				
				shapeList.removeAllElements();
				String selection = (String) comboBox_dimension.getSelectedItem();
				
				if(selection.equals("3D")){
					for(String s : SHAPES3D)
						shapeList.addElement(s);
				}
				else{
					for(String s : SHAPES4D)
						shapeList.addElement(s);
				}
				
				parent_mainWindow.selectDimension(selection);
			}
		}
	}
}