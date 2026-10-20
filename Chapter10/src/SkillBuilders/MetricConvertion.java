package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConvertion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConvertion window = new MetricConvertion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConvertion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Conv = new JLabel("Select Convertion");
		Conv.setBounds(10, 11, 112, 42);
		frame.getContentPane().add(Conv);
		
		JLabel Display = new JLabel("New label");
		Display.setBounds(10, 77, 112, 29);
		frame.getContentPane().add(Display);
		
		JComboBox Combo = new JComboBox();
		Combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(Combo.getSelectedItem().equals("inches to centimeters"))
				{
					Display.setText("Inches is selected");
				}
				
				else if(Combo.getSelectedItem().equals("feet to meters"))
				{
					Display.setText("Feet is selected");
				}
				else if(Combo.getSelectedItem().equals("gallons to litres"))
				{
					Display.setText("gallons is selected");
				}
									
				else if(Combo.getSelectedItem().equals("pounds to kilograms"))
				{
					Display.setText("pounds is selected");
				}
										
			}
		});
		Combo.setModel(new DefaultComboBoxModel(new String[] {"click here", "inches to centimeters", "feet to meters", "gallons to litres", "pounds to kilograms"}));
		Combo.setSelectedIndex(0);
		Combo.setBounds(166, 21, 128, 35);
		frame.getContentPane().add(Combo);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(200, 84, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
