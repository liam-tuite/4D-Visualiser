package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel {

	private JLabel lbl_settings;
	private JSeparator separator_horizontal_1, separator_horizontal_2, separator_horizontal_3;
	
	private ColorPanel panel_color;
	private MasterControlPanel panel_masterControl;
	private MainWindow parent_mainWindow;
	private RotationPanel panel_rotation;

	/**
	 * Create the panel.
	 */
	public ControlPanel(MainWindow mw) {
		
		this.parent_mainWindow = mw;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0};
		gridBagLayout.rowHeights = new int[] {20, 0, 90, 0, 100, 0, 100};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_settings = new JLabel("Settings");
		lbl_settings.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lbl_settings = new GridBagConstraints();
		gbc_lbl_settings.fill = GridBagConstraints.BOTH;
		gbc_lbl_settings.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_settings.gridx = 0;
		gbc_lbl_settings.gridy = 0;
		add(lbl_settings, gbc_lbl_settings);
		
		separator_horizontal_1 = new JSeparator();
		GridBagConstraints gbc_separator_horizontal_1 = new GridBagConstraints();
		gbc_separator_horizontal_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_horizontal_1.fill = GridBagConstraints.BOTH;
		gbc_separator_horizontal_1.gridx = 0;
		gbc_separator_horizontal_1.gridy = 1;
		add(separator_horizontal_1, gbc_separator_horizontal_1);
		
		panel_masterControl = new MasterControlPanel(parent_mainWindow);
		GridBagConstraints gbc_panel_masterControl = new GridBagConstraints();
		gbc_panel_masterControl.anchor = GridBagConstraints.WEST;
		gbc_panel_masterControl.insets = new Insets(0, 0, 5, 0);
		gbc_panel_masterControl.gridx = 0;
		gbc_panel_masterControl.gridy = 2;
		add(panel_masterControl, gbc_panel_masterControl);
		
		separator_horizontal_2 = new JSeparator();
		GridBagConstraints gbc_separator_horizontal_2 = new GridBagConstraints();
		gbc_separator_horizontal_2.fill = GridBagConstraints.BOTH;
		gbc_separator_horizontal_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_horizontal_2.gridx = 0;
		gbc_separator_horizontal_2.gridy = 3;
		add(separator_horizontal_2, gbc_separator_horizontal_2);
		
		panel_rotation = new RotationPanel(parent_mainWindow);
		GridBagConstraints gbc_panel_rotation = new GridBagConstraints();
		gbc_panel_rotation.insets = new Insets(0, 0, 5, 0);
		gbc_panel_rotation.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_rotation.gridx = 0;
		gbc_panel_rotation.gridy = 4;
		add(panel_rotation, gbc_panel_rotation);
		
		separator_horizontal_3 = new JSeparator();
		GridBagConstraints gbc_separator_horizontal_3 = new GridBagConstraints();
		gbc_separator_horizontal_3.insets = new Insets(0, 0, 5, 0);
		gbc_separator_horizontal_3.fill = GridBagConstraints.BOTH;
		gbc_separator_horizontal_3.gridx = 0;
		gbc_separator_horizontal_3.gridy = 5;
		add(separator_horizontal_3, gbc_separator_horizontal_3);
		
		panel_color = new ColorPanel(parent_mainWindow);
		GridBagConstraints gbc_panel_color = new GridBagConstraints();
		gbc_panel_color.fill = GridBagConstraints.BOTH;
		gbc_panel_color.gridx = 0;
		gbc_panel_color.gridy = 6;
		add(panel_color, gbc_panel_color);
	}
	
	protected void selectDimension(String d){
		panel_rotation.selectDimension(d);
	}
}