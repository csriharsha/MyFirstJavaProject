import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Mass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mass frame = new Mass();
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
	public Mass() {
		setTitle("Mass converter");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(15, 40, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 40, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kg", "g", "lb"}));
		comboBox.setBounds(15, 82, 146, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kg", "g", "lb"}));
		comboBox_1.setBounds(267, 82, 146, 26);
		contentPane.add(comboBox_1);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textField.getText();
				Double input = Double.parseDouble(s);
				String lvalue = String.valueOf(comboBox.getSelectedItem());
				String rvalue = String.valueOf(comboBox_1.getSelectedItem());
				Double output;
				if(lvalue == "Kg") {
					switch(rvalue) {
					case "Kg":
						textField_1.setText(String.valueOf(input));
						break;
					case "g":
						output = input*1000;
						textField_1.setText(String.valueOf(output));
						break;
					case "lb":
						output = input*2.2046;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				else if(lvalue == "g") {
					switch(rvalue) {
					case "Kg":
						output = input/1000;
						textField_1.setText(String.valueOf(output));
						break;
					case "g":
						textField_1.setText(String.valueOf(input));
						break;
					case "lb":
						output = (input*2.2046)/1000;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				else {
					switch(rvalue) {
					case "Kg":
						output = input/2.2046;
						textField_1.setText(String.valueOf(output));
						break;
					case "g":
						output = (input*1000)/2.2046;
						textField_1.setText(String.valueOf(output));
						break;
					case "lb":
						textField_1.setText(String.valueOf(input));
						break;
					}
				}
			}
		});
		btnCompute.setBounds(15, 160, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(332, 160, 81, 29);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("=");
		label.setBounds(211, 43, 25, 20);
		contentPane.add(label);
		
		

	}
}
