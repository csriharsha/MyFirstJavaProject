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
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

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
		setTitle("Triangle");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base(b) =");
		lblNewLabel.setBounds(15, 16, 70, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Height(h) =");
		lblNewLabel_1.setBounds(15, 48, 84, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Side1(s1) =");
		lblNewLabel_2.setBounds(15, 81, 89, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Side2(s2) =");
		lblNewLabel_3.setBounds(15, 117, 84, 20);
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
		lblPerimeterB.setBounds(15, 169, 192, 20);
		contentPane.add(lblPerimeterB);
		
		textField_4 = new JTextField();
		textField_4.setBounds(216, 166, 146, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblArea = new JLabel("Area =");
		lblArea.setForeground(Color.BLACK);
		lblArea.setBounds(15, 208, 50, 20);
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
		btnBack.setBounds(318, 249, 84, 29);
		contentPane.add(btnBack);
		
		btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField.getText();
				String s3 = textField.getText();
				String s4 = textField.getText();
				double b = Double.parseDouble(s1);
				double h = Double.parseDouble(s2);
				double S1 = Double.parseDouble(s3);
				double S2 = Double.parseDouble(s4);
				double perimeter = b+S1+S2;
				double area = (h*b)/2;
				textField_4.setText(String.valueOf(perimeter));
				textField_5.setText(String.valueOf(area));
			}
		});
		btnCompute.setBounds(25, 249, 97, 29);
		contentPane.add(btnCompute);
	}

}
