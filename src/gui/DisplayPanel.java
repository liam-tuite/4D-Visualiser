package gui;

import javax.swing.JPanel;

import graphics.GraphicsPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

@SuppressWarnings("serial")
public class DisplayPanel extends JPanel {
	
	private ComboBoxPanel panel_comboBox;
	private GraphicsPanel panel_graphics;

	/**
	 * Create the panel.
	 */
	public DisplayPanel(MainWindow mw) {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {500};
		gridBagLayout.rowHeights = new int[] {20, 20, 500};
		gridBagLayout.columnWeights = new double[]{0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);

		panel_comboBox = new ComboBoxPanel(mw, this);
		GridBagConstraints gbc_panel_comboBox = new GridBagConstraints();
		gbc_panel_comboBox.fill = GridBagConstraints.BOTH;
		gbc_panel_comboBox.gridx = 0;
		gbc_panel_comboBox.gridy = 0;
		add(panel_comboBox, gbc_panel_comboBox);
		
		panel_graphics = new GraphicsPanel();
		GridBagConstraints gbc_panel_graphics = new GridBagConstraints();
		gbc_panel_graphics.fill = GridBagConstraints.BOTH;
		gbc_panel_graphics.gridy = 2;
		gbc_panel_graphics.gridx = 0;
		add(panel_graphics, gbc_panel_graphics);
	}
	
	protected void initSelections(){
		panel_comboBox.initSelections();
	}
	
	protected void setColors(Color f, Color b){
		panel_graphics.setForeground(f);
		panel_graphics.setBackground(b);
	}
	
	protected void setRotating(boolean rotating){
		panel_graphics.setRotating(rotating);
	}
	
	protected void setShape(String selectedShape){
		panel_graphics.setShape(selectedShape);
	}
	
	protected void updateScale(){
		panel_graphics.updateScale();
	}
}