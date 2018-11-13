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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("radius = ");
		lblNewLabel.setBounds(15, 29, 69, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(80, 26, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCircumference = new JLabel("Circumference =");
		lblCircumference.setBounds(15, 81, 130, 20);
		contentPane.add(lblCircumference);
		
		textField_1 = new JTextField();
		textField_1.setBounds(245, 78, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblArea = new JLabel("Area =");
		lblArea.setBounds(25, 117, 59, 20);
		contentPane.add(lblArea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 114, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblpiradius = new JLabel("2*pi*radius =");
		lblpiradius.setLabelFor(this);
		lblpiradius.setBounds(138, 81, 115, 20);
		contentPane.add(lblpiradius);
		
		JLabel lblPiradius = new JLabel("pi*(radius)^2 =");
		lblPiradius.setBounds(80, 117, 146, 20);
		contentPane.add(lblPiradius);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(298, 199, 115, 29);
		contentPane.add(btnBack);
		
		JButton btnCompute = new JButton("compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
			}
		});
		btnCompute.setBounds(15, 199, 115, 29);
		contentPane.add(btnCompute);
	}

}
