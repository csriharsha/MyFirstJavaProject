import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Circle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circle frame = new Circle();
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
	public Circle() {
		setTitle("Circle");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("radius = ");
		lblNewLabel.setBounds(15, 29, 69, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(82, 26, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 78, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 114, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(298, 177, 115, 29);
		contentPane.add(btnBack);
		
		JButton btnCompute = new JButton("compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				double r = Double.parseDouble(s1);
				double circumference = 2*3.1416*r;
				double area = 3.1416*r*r;
				textField_1.setText(String.valueOf(circumference));
				textField_2.setText(String.valueOf(area));
			}
		});
		btnCompute.setBounds(15, 177, 115, 29);
		contentPane.add(btnCompute);
		
		JLabel lblCircumferencepir = new JLabel("Circumference = 2*pi*r =");
		lblCircumferencepir.setBounds(15, 81, 186, 20);
		contentPane.add(lblCircumferencepir);
		
		JLabel lblNewLabel_1 = new JLabel("Area = pi*r*r =");
		lblNewLabel_1.setBounds(15, 117, 115, 20);
		contentPane.add(lblNewLabel_1);
	}

}
