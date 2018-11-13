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

public class Triangle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnCompute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangle frame = new Triangle();
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
	public Triangle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base(b) =");
		lblNewLabel.setBounds(15, 16, 89, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Height(h) =");
		lblNewLabel_1.setBounds(15, 48, 89, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Side1(s1) =");
		lblNewLabel_2.setBounds(15, 81, 89, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Side2(s2) =");
		lblNewLabel_3.setBounds(15, 117, 89, 20);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(91, 13, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 45, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 114, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 78, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPerimeterB = new JLabel("Perimeter = b + s1 + s2 =");
		lblPerimeterB.setBounds(15, 169, 208, 20);
		contentPane.add(lblPerimeterB);
		
		textField_4 = new JTextField();
		textField_4.setBounds(216, 166, 146, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblArea = new JLabel("Area =");
		lblArea.setBounds(15, 208, 69, 20);
		contentPane.add(lblArea);
		
		textField_5 = new JTextField();
		textField_5.setBounds(69, 205, 146, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(329, 208, 84, 29);
		contentPane.add(btnBack);
		
		btnCompute = new JButton("Compute");
		btnCompute.setBounds(226, 208, 97, 29);
		contentPane.add(btnCompute);
	}

}
