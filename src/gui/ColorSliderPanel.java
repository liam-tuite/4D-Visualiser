package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class ColorSliderPanel extends JPanel {
	
	private JLabel lbl_title, lbl_rvalue, lbl_gvalue, lbl_bvalue, lbl_r, lbl_g, lbl_b;
	private JPanel panel_labels, panel_sliders;
	private JSlider slider_r, slider_g, slider_b;
	
	private char c;
	private Color defaultColor;
	
	private ColorPanel parent_colorPanel;

	/**
	 * Create the panel.
	 */
	public ColorSliderPanel(ColorPanel cp, String title, char c, Color defaultColor){
		
		this.c = c;
		this.parent_colorPanel = cp;
		this.defaultColor = defaultColor;

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {84, 200};
		gridBagLayout.rowHeights = new int[] {30, 100};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_title = new JLabel(title);
		lbl_title.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_title.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lbl_title = new GridBagConstraints();
		gbc_lbl_title.gridwidth = 2;
		gbc_lbl_title.anchor = GridBagConstraints.WEST;
		gbc_lbl_title.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_title.gridx = 0;
		gbc_lbl_title.gridy = 0;
		add(lbl_title, gbc_lbl_title);
		
		panel_labels = new JPanel();
		GridBagConstraints gbc_panel_labels = new GridBagConstraints();
		gbc_panel_labels.insets = new Insets(0, 0, 5, 0);
		gbc_panel_labels.fill = GridBagConstraints.BOTH;
		gbc_panel_labels.gridx = 0;
		gbc_panel_labels.gridy = 1;
		add(panel_labels, gbc_panel_labels);
		panel_labels.setLayout(new GridLayout(3, 2, 0, 0));
		
		lbl_r = new JLabel("R:");
		lbl_r.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_r);
		
		lbl_rvalue = new JLabel(Integer.toString(defaultColor.getRed()));
		lbl_rvalue.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_rvalue);
		
		lbl_g = new JLabel("G:");
		lbl_g.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_g);
		
		lbl_gvalue = new JLabel(Integer.toString(defaultColor.getGreen()));
		lbl_gvalue.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_gvalue);
		
		lbl_b = new JLabel("B:");
		lbl_b.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_b);
		
		lbl_bvalue = new JLabel(Integer.toString(defaultColor.getBlue()));
		lbl_bvalue.setHorizontalAlignment(SwingConstants.CENTER);
		panel_labels.add(lbl_bvalue);
		
		SlideListener slideListener = new SlideListener();
		
		panel_sliders = new JPanel();
		GridBagConstraints gbc_panel_sliders = new GridBagConstraints();
		gbc_panel_sliders.insets = new Insets(0, 0, 5, 0);
		gbc_panel_sliders.fill = GridBagConstraints.BOTH;
		gbc_panel_sliders.gridx = 1;
		gbc_panel_sliders.gridy = 1;
		add(panel_sliders, gbc_panel_sliders);
		panel_sliders.setLayout(new GridLayout(3, 1, 0, 0));
		
		slider_r = new JSlider();
		slider_r.setMaximum(255);
		slider_r.setValue(defaultColor.getRed());
		slider_r.addChangeListener(slideListener);
		panel_sliders.add(slider_r);
		
		slider_g = new JSlider();
		slider_g.setMaximum(255);
		slider_g.setValue(defaultColor.getGreen());
		slider_g.addChangeListener(slideListener);
		panel_sliders.add(slider_g);
		
		slider_b = new JSlider();
		slider_b.setMaximum(255);
		slider_b.setValue(defaultColor.getBlue());
		slider_b.addChangeListener(slideListener);
		panel_sliders.add(slider_b);
	}
	
	protected void resetDefaults(){

		slider_r.setValue(defaultColor.getRed());
		slider_g.setValue(defaultColor.getGreen());
		slider_b.setValue(defaultColor.getBlue());

		lbl_rvalue.setText(Integer.toString(slider_r.getValue()));
		lbl_gvalue.setText(Integer.toString(slider_g.getValue()));
		lbl_bvalue.setText(Integer.toString(slider_b.getValue()));
	}
	
	private class SlideListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e){
			
			Object src = e.getSource();
			
			if(src.equals(slider_r))
				lbl_rvalue.setText(Integer.toString(((JSlider) src).getValue()));
			else if(src.equals(slider_g))
				lbl_gvalue.setText(Integer.toString(((JSlider) src).getValue()));
			else if(src.equals(slider_b))
				lbl_bvalue.setText(Integer.toString(((JSlider) src).getValue()));

			Color color = new Color(slider_r.getValue(), slider_g.getValue(), slider_b.getValue());
			parent_colorPanel.setColor(c, color);
		}
	}
}