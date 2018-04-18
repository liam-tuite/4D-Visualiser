package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JSeparator;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private JPanel contentPane;

	private ControlPanel panel_control;
	private DisplayPanel panel_display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setResizable(false);
		setTitle("4D Visualiser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{531, 0, 301, 0};
		gbl_contentPane.rowHeights = new int[]{530, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		panel_display = new DisplayPanel(this);
		GridBagConstraints gbc_panel_display = new GridBagConstraints();
		gbc_panel_display.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_display.insets = new Insets(0, 0, 0, 5);
		gbc_panel_display.gridx = 0;
		gbc_panel_display.gridy = 0;
		contentPane.add(panel_display, gbc_panel_display);
		
		JSeparator separator_vertical = new JSeparator();
		separator_vertical.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_vertical = new GridBagConstraints();
		gbc_separator_vertical.fill = GridBagConstraints.BOTH;
		gbc_separator_vertical.gridx = 1;
		gbc_separator_vertical.gridy = 0;
		contentPane.add(separator_vertical, gbc_separator_vertical);
		
		panel_control = new ControlPanel(this);
		GridBagConstraints gbc_panel_control = new GridBagConstraints();
		gbc_panel_control.insets = new Insets(0, 0, 0, 5);
		gbc_panel_control.fill = GridBagConstraints.BOTH;
		gbc_panel_control.gridx = 2;
		gbc_panel_control.gridy = 0;
		contentPane.add(panel_control, gbc_panel_control);
		
		panel_display.initSelections();
		
		this.pack();
	}
	
	protected void selectDimension(String selection){
		panel_control.selectDimension(selection);
	}
	
	protected void setColors(Color f, Color b){
		panel_display.setColors(f, b);
	}
	
	protected void setRotating(boolean rotating){
		panel_display.setRotating(rotating);
	}
	
	protected void updateScale(){
		panel_display.updateScale();
	}
}