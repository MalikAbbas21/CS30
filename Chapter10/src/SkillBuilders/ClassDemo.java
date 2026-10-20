package SkillBuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ClassDemo {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;
	private JButton submit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassDemo window = new ClassDemo();
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
	public ClassDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Panel = new JPanel();
		frame.getContentPane().add(Panel, BorderLayout.CENTER);
		Panel.setLayout(null);
		
		FN = new JTextField();
		FN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
			if(FN.getText().equals("Enter your first name"))	
			{
				FN.setText("");
			}
				
			}
		});
		FN.setText("Enter your first name");
		FN.setBounds(10, 29, 140, 38);
		Panel.add(FN);
		FN.setColumns(10);
		JLabel Display = new JLabel("");
		Display.setBounds(55, 217, 253, 22);
		Panel.add(Display);
		LN = new JTextField();
		LN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				if(LN.getText().equals("Enter your last name"))	
				{
					LN.setText("");
				}
					
				
			}
		});
		LN.setText("Enter your last name");
		LN.setColumns(10);
		LN.setBounds(181, 29, 140, 38);
		Panel.add(LN);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = FN.getText();
				String lastN = LN.getText();
				Display.setText(firstN
						+" " + lastN);
			}
		});
		submit.setFont(new Font("Snap ITC", Font.ITALIC, 11));
		submit.setBounds(414, 50, 129, 189);
		Panel.add(submit);
		
		
	}
}
