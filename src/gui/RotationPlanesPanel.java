package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.RotationPanel.TickListener;

@SuppressWarnings("serial")
public class RotationPlanesPanel extends JPanel {

	
	private JCheckBox chckbxXY, chckbxYZ, chckbxZX, chckbxXW, chckbxYW, chckbxZW;
	private JLabel lbl_4d;
	
	/**
	 * Create the panel.
	 */
	public RotationPlanesPanel(RotationPanel rp, TickListener tickListener) {

		chckbxXW = new JCheckBox("XW");
		chckbxXY = new JCheckBox("XY");
		chckbxYW = new JCheckBox("YW");
		chckbxYZ = new JCheckBox("YZ");
		chckbxZW = new JCheckBox("ZW");
		chckbxZX = new JCheckBox("ZX");
		rp.setRotationPlanesChckbxs(new JCheckBox[]{chckbxXY, chckbxYZ, chckbxZX, chckbxXW, chckbxYW, chckbxZW});
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_4d = new JLabel("4D");
		GridBagConstraints gbc_lbl_4d = new GridBagConstraints();
		gbc_lbl_4d.gridwidth = 3;
		gbc_lbl_4d.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_4d.gridx = 0;
		gbc_lbl_4d.gridy = 0;
		add(lbl_4d, gbc_lbl_4d);
		lbl_4d.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		chckbxXW.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxXW = new GridBagConstraints();
		gbc_chckbxXW.fill = GridBagConstraints.BOTH;
		gbc_chckbxXW.gridx = 0;
		gbc_chckbxXW.gridy = 1;
		add(chckbxXW, gbc_chckbxXW);
		
		chckbxXY.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxXY = new GridBagConstraints();
		gbc_chckbxXY.fill = GridBagConstraints.BOTH;
		gbc_chckbxXY.gridx = 1;
		gbc_chckbxXY.gridy = 1;
		add(chckbxXY, gbc_chckbxXY);

		chckbxYW.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxYW = new GridBagConstraints();
		gbc_chckbxYW.fill = GridBagConstraints.BOTH;
		gbc_chckbxYW.gridx = 2;
		gbc_chckbxYW.gridy = 1;
		add(chckbxYW, gbc_chckbxYW);
		
		chckbxYZ.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxYZ = new GridBagConstraints();
		gbc_chckbxYZ.fill = GridBagConstraints.BOTH;
		gbc_chckbxYZ.gridx = 0;
		gbc_chckbxYZ.gridy = 2;
		add(chckbxYZ, gbc_chckbxYZ);

		chckbxZW.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxZW = new GridBagConstraints();
		gbc_chckbxZW.fill = GridBagConstraints.BOTH;
		gbc_chckbxZW.gridx = 1;
		gbc_chckbxZW.gridy = 2;
		add(chckbxZW, gbc_chckbxZW);
		
		chckbxZX.addItemListener(tickListener);
		GridBagConstraints gbc_chckbxZX = new GridBagConstraints();
		gbc_chckbxZX.fill = GridBagConstraints.BOTH;
		gbc_chckbxZX.gridx = 2;
		gbc_chckbxZX.gridy = 2;
		add(chckbxZX, gbc_chckbxZX);
		
		chckbxXY.setSelected(true);
		chckbxZW.setSelected(true);
	}
}