package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import graphics.ViewSettings;

@SuppressWarnings("serial")
public class RotationPanel extends JPanel {
	
	private JCheckBox chckbxRotate, chckbxClockwise;
	private JLabel lbl_rotation;
	
	private JCheckBox[] rotationAxesChckbxs, rotationPlanesChckbxs;
	
	private MainWindow parent_mainWindow;
	private RotationAxesPanel panel_rotationAxes;
	private RotationPlanesPanel panel_rotationPlanes;

	/**
	 * Create the panel.
	 */
	public RotationPanel(MainWindow mw) {
		
		this.parent_mainWindow = mw;

		chckbxRotate = new JCheckBox("Rotate");

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 98, 30, 128, 30, 71};
		gridBagLayout.rowHeights = new int[] {20, 50, 50};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_rotation = new JLabel("Rotation");
		lbl_rotation.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lbl_rotation = new GridBagConstraints();
		gbc_lbl_rotation.anchor = GridBagConstraints.WEST;
		gbc_lbl_rotation.gridwidth = 2;
		gbc_lbl_rotation.gridx = 0;
		gbc_lbl_rotation.gridy = 0;
		add(lbl_rotation, gbc_lbl_rotation);
		
		TickListener tickListener = new TickListener();
		
		chckbxRotate.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxRotate = new GridBagConstraints();
		gbc_chckbxRotate.anchor = GridBagConstraints.WEST;
		gbc_chckbxRotate.gridx = 5;
		gbc_chckbxRotate.gridy = 1;
		add(chckbxRotate, gbc_chckbxRotate);
		
		chckbxClockwise = new JCheckBox("Clockwise");
		chckbxClockwise.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxClockwise = new GridBagConstraints();
		gbc_chckbxClockwise.anchor = GridBagConstraints.WEST;
		gbc_chckbxClockwise.gridx = 5;
		gbc_chckbxClockwise.gridy = 2;
		add(chckbxClockwise, gbc_chckbxClockwise);
		
		panel_rotationAxes = new RotationAxesPanel(this, tickListener);
		GridBagConstraints gbc_panel_rotationAxes = new GridBagConstraints();
		gbc_panel_rotationAxes.gridheight = 2;
		gbc_panel_rotationAxes.gridx = 1;
		gbc_panel_rotationAxes.gridy = 1;
		add(panel_rotationAxes, gbc_panel_rotationAxes);
		
		panel_rotationPlanes = new RotationPlanesPanel(this, tickListener);
		GridBagConstraints gbc_panel_rotationPlanes = new GridBagConstraints();
		gbc_panel_rotationPlanes.gridheight = 2;
		gbc_panel_rotationPlanes.gridx = 3;
		gbc_panel_rotationPlanes.gridy = 1;
		add(panel_rotationPlanes, gbc_panel_rotationPlanes);

		chckbxRotate.setSelected(true);
		chckbxClockwise.setSelected(true);
	}
	
	protected void manageRotation(JCheckBox[] boxes){
		
		// check if all active rotation checkboxes are disabled
		boolean disabled = true;
		for(JCheckBox c : boxes){
			if(c.isSelected()){
				disabled = false;
				break;
			}
		}
		
		// if so, pause rotation
		if(disabled){
			chckbxRotate.setSelected(false);
			chckbxRotate.setEnabled(false);
		}
		// otherwise, resume rotation
		else{
			chckbxRotate.setEnabled(true);
		}
	}
	
	protected void selectDimension(String d){

		JCheckBox[] enableBoxes, disableBoxes;
		
		if(d.equals("3D")){
			enableBoxes = rotationAxesChckbxs;
			disableBoxes = rotationPlanesChckbxs;
		}
		else{
			enableBoxes = rotationPlanesChckbxs;
			disableBoxes = rotationAxesChckbxs;
		}
		
		for(JCheckBox c : disableBoxes)
			c.setEnabled(false);
		for(JCheckBox c : enableBoxes)
			c.setEnabled(true);
		manageRotation(enableBoxes);
	}
	
	protected void setRotationAxesChckbxs(JCheckBox[] boxes){
		this.rotationAxesChckbxs = boxes;
	}
	
	protected void setRotationPlanesChckbxs(JCheckBox[] boxes){
		this.rotationPlanesChckbxs = boxes;
	}
	
	private void toggleRotationOption(String r){
		// 3D case
		if(r.length() == 1){
			ViewSettings.toggleAxis(r);
			manageRotation(rotationAxesChckbxs);
		}
		// 4D
		else{
			ViewSettings.togglePlane(r);
			manageRotation(rotationPlanesChckbxs);
		}
	}

	protected class TickListener implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource().equals(chckbxRotate))
				parent_mainWindow.setRotating(chckbxRotate.isSelected());
			else if(e.getSource().equals(chckbxClockwise))
				ViewSettings.setClockwise(chckbxClockwise.isSelected());
			else
				toggleRotationOption(((JCheckBox) e.getSource()).getText());
		}
	}
}