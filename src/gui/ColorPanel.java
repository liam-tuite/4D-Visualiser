package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ColorPanel extends JPanel {
	
	private JButton btn_reset;
	private JLabel lbl_colour;
	private JPanel panel_foregroundColor_display, panel_backgroundColor_display;
	
	private Color defaultForeground, defaultBackground;
	
	private ColorSliderPanel panel_foregroundColor_control, panel_backgroundColor_control;
	private MainWindow parent_mainWindow;

	/**
	 * Create the panel.
	 */
	public ColorPanel(MainWindow mw) {
		
		this.parent_mainWindow = mw;
		
		initDefaultColors();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[] {30, 130, 130};
		gridBagLayout.columnWidths = new int[] {309, 130};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_colour = new JLabel("Colour");
		lbl_colour.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lbl_colour = new GridBagConstraints();
		gbc_lbl_colour.anchor = GridBagConstraints.WEST;
		gbc_lbl_colour.fill = GridBagConstraints.VERTICAL;
		gbc_lbl_colour.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_colour.gridx = 0;
		gbc_lbl_colour.gridy = 0;
		add(lbl_colour, gbc_lbl_colour);
		
		btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new ClickListener());
		GridBagConstraints gbc_btn_reset = new GridBagConstraints();
		gbc_btn_reset.insets = new Insets(0, 0, 5, 0);
		gbc_btn_reset.gridx = 1;
		gbc_btn_reset.gridy = 0;
		add(btn_reset, gbc_btn_reset);
		
		panel_foregroundColor_control = new ColorSliderPanel(this, "Shape", 'F', defaultForeground);
		GridBagConstraints gbc_panel_foregroundColor_control = new GridBagConstraints();
		gbc_panel_foregroundColor_control.insets = new Insets(0, 0, 5, 5);
		gbc_panel_foregroundColor_control.fill = GridBagConstraints.BOTH;
		gbc_panel_foregroundColor_control.gridx = 0;
		gbc_panel_foregroundColor_control.gridy = 1;
		add(panel_foregroundColor_control, gbc_panel_foregroundColor_control);
		
		panel_foregroundColor_display = new JPanel();
		panel_foregroundColor_display.setBackground(defaultForeground);
		GridBagConstraints gbc_panel_foregroundColor_display = new GridBagConstraints();
		gbc_panel_foregroundColor_display.insets = new Insets(0, 0, 5, 0);
		gbc_panel_foregroundColor_display.fill = GridBagConstraints.BOTH;
		gbc_panel_foregroundColor_display.gridx = 1;
		gbc_panel_foregroundColor_display.gridy = 1;
		add(panel_foregroundColor_display, gbc_panel_foregroundColor_display);
		
		panel_backgroundColor_control = new ColorSliderPanel(this, "Background", 'B', defaultBackground);
		GridBagConstraints gbc_panel_backgroundColor_control = new GridBagConstraints();
		gbc_panel_backgroundColor_control.insets = new Insets(0, 0, 0, 5);
		gbc_panel_backgroundColor_control.fill = GridBagConstraints.BOTH;
		gbc_panel_backgroundColor_control.gridx = 0;
		gbc_panel_backgroundColor_control.gridy = 2;
		add(panel_backgroundColor_control, gbc_panel_backgroundColor_control);
		
		panel_backgroundColor_display = new JPanel();
		panel_backgroundColor_display.setBackground(defaultBackground);
		GridBagConstraints gbc_panel_backgroundColor_display = new GridBagConstraints();
		gbc_panel_backgroundColor_display.fill = GridBagConstraints.BOTH;
		gbc_panel_backgroundColor_display.gridx = 1;
		gbc_panel_backgroundColor_display.gridy = 2;
		add(panel_backgroundColor_display, gbc_panel_backgroundColor_display);
	}
	
	private void initDefaultColors(){

		defaultForeground = new Color(51, 51, 51);
		defaultBackground = new Color(238, 238, 238);
	}
	
	private void resetDefaults(){
		
		panel_foregroundColor_control.resetDefaults();
		panel_backgroundColor_control.resetDefaults();

		panel_foregroundColor_display.setBackground(defaultForeground);
		panel_backgroundColor_display.setBackground(defaultBackground);
	}
	
	protected void setColor(char c, Color color){
		
		if(c == 'F'){
			panel_foregroundColor_display.setBackground(color);
			parent_mainWindow.setColors(color, panel_backgroundColor_display.getBackground());
		}
		else{
			panel_backgroundColor_display.setBackground(color);
			parent_mainWindow.setColors(panel_foregroundColor_display.getBackground(), color);
		}
	}
	
	private class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			resetDefaults();
		}
	}
}