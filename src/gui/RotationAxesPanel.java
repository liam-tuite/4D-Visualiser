package gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.RotationPanel.TickListener;

@SuppressWarnings("serial")
public class RotationAxesPanel extends JPanel {

	private Component glue_rotationAxes;
	private JCheckBox chckbxX, chckbxY, chckbxZ;
	private JLabel lbl_3d;
	
	/**
	 * Create the panel.
	 */
	public RotationAxesPanel(RotationPanel rp, TickListener tickListener) {
		
		chckbxX = new JCheckBox("X");
		chckbxY = new JCheckBox("Y");
		chckbxZ = new JCheckBox("Z");
		rp.setRotationAxesChckbxs(new JCheckBox[]{chckbxX, chckbxY, chckbxZ});

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_3d = new JLabel("3D");
		GridBagConstraints gbc_lbl_3d = new GridBagConstraints();
		gbc_lbl_3d.gridwidth = 3;
		gbc_lbl_3d.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_3d.gridx = 0;
		gbc_lbl_3d.gridy = 0;
		add(lbl_3d, gbc_lbl_3d);
		lbl_3d.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		chckbxX.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxX = new GridBagConstraints();
		gbc_chckbxX.fill = GridBagConstraints.BOTH;
		gbc_chckbxX.gridx = 0;
		gbc_chckbxX.gridy = 1;
		add(chckbxX, gbc_chckbxX);
		
		chckbxY.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxY = new GridBagConstraints();
		gbc_chckbxY.fill = GridBagConstraints.BOTH;
		gbc_chckbxY.gridx = 1;
		gbc_chckbxY.gridy = 1;
		add(chckbxY, gbc_chckbxY);
		
		chckbxZ.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxZ = new GridBagConstraints();
		gbc_chckbxZ.fill = GridBagConstraints.BOTH;
		gbc_chckbxZ.gridx = 2;
		gbc_chckbxZ.gridy = 1;
		add(chckbxZ, gbc_chckbxZ);
		
		glue_rotationAxes = Box.createGlue();
		GridBagConstraints gbc_glue_rotationAxes = new GridBagConstraints();
		gbc_glue_rotationAxes.fill = GridBagConstraints.BOTH;
		gbc_glue_rotationAxes.gridwidth = 3;
		gbc_glue_rotationAxes.insets = new Insets(0, 0, 0, 5);
		gbc_glue_rotationAxes.gridx = 0;
		gbc_glue_rotationAxes.gridy = 2;
		add(glue_rotationAxes, gbc_glue_rotationAxes);
		
		chckbxX.setSelected(true);
		chckbxY.setSelected(true);
	}
}