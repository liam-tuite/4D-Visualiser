package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import graphics.ViewSettings;

@SuppressWarnings("serial")
public class MasterControlPanel extends JPanel {

	private JLabel lbl_speed, lbl_scale, lbl_scale_value, lbl_speed_value;
	private JSlider slider_scale, slider_speed;
	
	private MainWindow parent_mainWindow;
	
	/**
	 * Create the panel.
	 */
	public MasterControlPanel(MainWindow mw) {
		
		this.parent_mainWindow = mw;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {60, 60, 30, 210, 30, 30};
		gridBagLayout.rowHeights = new int[] {40, 40};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		lbl_scale = new JLabel("Scale");
		GridBagConstraints gbc_lbl_scale = new GridBagConstraints();
		gbc_lbl_scale.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_scale.gridx = 1;
		gbc_lbl_scale.gridy = 0;
		add(lbl_scale, gbc_lbl_scale);
		
		SlideListener slideListener = new SlideListener();
		
		slider_scale = new JSlider();
		slider_scale.setMinimum(100);
		slider_scale.setMaximum(200);
		slider_scale.setValue(100);
		slider_scale.addChangeListener(slideListener);
		GridBagConstraints gbc_slider_scale = new GridBagConstraints();
		gbc_slider_scale.fill = GridBagConstraints.BOTH;
		gbc_slider_scale.insets = new Insets(0, 0, 5, 5);
		gbc_slider_scale.gridx = 3;
		gbc_slider_scale.gridy = 0;
		add(slider_scale, gbc_slider_scale);
		
		lbl_scale_value = new JLabel("1.00");
		GridBagConstraints gbc_lbl_scale_value = new GridBagConstraints();
		gbc_lbl_scale_value.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_scale_value.gridx = 5;
		gbc_lbl_scale_value.gridy = 0;
		add(lbl_scale_value, gbc_lbl_scale_value);
		
		lbl_speed = new JLabel("Speed");
		GridBagConstraints gbc_lbl_speed = new GridBagConstraints();
		gbc_lbl_speed.gridx = 1;
		gbc_lbl_speed.gridy = 1;
		add(lbl_speed, gbc_lbl_speed);
		
		slider_speed = new JSlider();
		slider_speed.setMinimum(1);
		slider_speed.setMaximum(4);
		slider_speed.setValue(1);
		slider_speed.addChangeListener(slideListener);
		GridBagConstraints gbc_slider_speed = new GridBagConstraints();
		gbc_slider_speed.insets = new Insets(0, 0, 0, 5);
		gbc_slider_speed.gridx = 3;
		gbc_slider_speed.gridy = 1;
		add(slider_speed, gbc_slider_speed);
		
		lbl_speed_value = new JLabel("1.00");
		GridBagConstraints gbc_lbl_speed_value = new GridBagConstraints();
		gbc_lbl_speed_value.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_speed_value.gridx = 5;
		gbc_lbl_speed_value.gridy = 1;
		add(lbl_speed_value, gbc_lbl_speed_value);
	}
	
	private class SlideListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e){
			
			if(e.getSource().equals(slider_scale)){
				
				ViewSettings.setScalar3(ViewSettings.BASE_SCALAR3 * ((double) slider_scale.getValue() / 100));
				ViewSettings.setScalar4(ViewSettings.BASE_SCALAR4 * ((double) slider_scale.getValue() / 100));

				lbl_scale_value.setText(String.format("%.2f", ViewSettings.getScalar3() / ViewSettings.BASE_SCALAR3));
				
				parent_mainWindow.updateScale();
			}
			else{
				ViewSettings.setRotationAngle3(ViewSettings.BASE_ROTATION_ANGLE3 * ((double) slider_speed.getValue()));
				ViewSettings.setRotationAngle4(ViewSettings.BASE_ROTATION_ANGLE4 * ((double) slider_speed.getValue()));

				lbl_speed_value.setText(String.format("%.2f",
						ViewSettings.getRotationAngle3() / ViewSettings.BASE_ROTATION_ANGLE3));

				ViewSettings.updateRotationMatrices();
			}
		}
	}
}