import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Length extends JFrame {

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
					Length frame = new Length();
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
	public Length() {
		setBackground(Color.BLACK);
		setTitle("Length converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 260);
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Km", "m", "mile", "inch", "feet"}));
		comboBox.setBounds(15, 82, 146, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Km", "m", "mile", "inch", "feet"}));
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
				if(lvalue == "Km") {
					switch(rvalue) {
					case "Km":
						textField_1.setText(String.valueOf(input));
						break;
					case "m":
						output = input*1000;
						textField_1.setText(String.valueOf(output));
						break;
					case "mile":
						output = input*0.621;
						textField_1.setText(String.valueOf(output));
						break;
					case "inch":
						output = input*3280.84*12;
						textField_1.setText(String.valueOf(output));
						break;
					case "feet":
						output = input*3280.84;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				
				else if(lvalue == "m") {
					switch(rvalue) {
					case "Km":
						output = input/1000;
						textField_1.setText(String.valueOf(input));
						break;
					case "m":
						textField_1.setText(String.valueOf(input));
						break;
					case "mile":
						output = (input*0.621)/1000;
						textField_1.setText(String.valueOf(output));
						break;
					case "inch":
						output = input*3.28084*12;
						textField_1.setText(String.valueOf(output));
						break;
					case "feet":
						output = input*3.28084;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				
				else if(lvalue == "mile") {
					switch(rvalue) {
					case "Km":
						output = input/0.621;
						textField_1.setText(String.valueOf(input));
						break;
					case "m":
						output = (input/0.621)*1000;
						textField_1.setText(String.valueOf(input));
						break;
					case "mile":
						textField_1.setText(String.valueOf(input));
						break;
					case "inch":
						output = input*3.28084*12;
						textField_1.setText(String.valueOf(output));
						break;
					case "feet":
						output = (input*3280.84)/0.621;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				
				else if(lvalue == "inch") {
					switch(rvalue) {
					case "Km":
						output = (input/3280.84)/12;
						textField_1.setText(String.valueOf(input));
						break;
					case "m":
						output = ((input/3280.84)*1000)/12;
						textField_1.setText(String.valueOf(input));
						break;
					case "mile":
						output = ((input*0.621)/3280.84)/12;
						textField_1.setText(String.valueOf(output));
						break;
					case "inch":
						textField_1.setText(String.valueOf(input));
						break;
					case "feet":
						output = input/12;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				
				else {
					switch(rvalue) {
					case "Km":
						output = input/3280.84;
						textField_1.setText(String.valueOf(input));
						break;
					case "m":
						output = (input/3280.84)*1000;
						textField_1.setText(String.valueOf(input));
						break;
					case "mile":
						output = (input*0.621)/3280.84;
						textField_1.setText(String.valueOf(output));
						break;
					case "inch":
						output = input*12;
						textField_1.setText(String.valueOf(output));
						break;
					case "feet":
						textField_1.setText(String.valueOf(input));
						break;
					}
				}
			}
		});
		btnCompute.setBounds(25, 148, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		});
		btnBack.setBounds(332, 148, 81, 29);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("=");
		label.setBounds(211, 43, 25, 20);
		contentPane.add(label);

	}

}
