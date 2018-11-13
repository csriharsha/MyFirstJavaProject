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

public class Temperature extends JFrame {

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
					Temperature frame = new Temperature();
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
	public Temperature() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0C", "0F", "K"}));
		comboBox.setBounds(15, 82, 146, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0C", "0F", "K"}));
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
				if(lvalue == "0C") {
					switch(rvalue) {
					case "0C":
						textField_1.setText(String.valueOf(input));
						break;
					case "0F":
						output = (input*9)/5+32;
						textField_1.setText(String.valueOf(output));
						break;
					case "K":
						output = input+273;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				else if(lvalue == "0F") {
					switch(rvalue) {
					case "0C":
						output = (input-32)*5/9;
						textField_1.setText(String.valueOf(output));
						break;
					case "0F":
						textField_1.setText(String.valueOf(input));
						break;
					case "K":
						output = (input-32)*5/9+273;
						textField_1.setText(String.valueOf(output));
						break;
					}
				}
				else {
					switch(rvalue) {
					case "0C":
						output = input/3600;
						textField_1.setText(String.valueOf(output));
						break;
					case "0F":
						output = input/60;
						textField_1.setText(String.valueOf(output));
						break;
					case "K":
						textField_1.setText(String.valueOf(input));
						break;
					}
				}
			}
		});
		btnCompute.setBounds(160, 132, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(15, 199, 81, 29);
		contentPane.add(btnBack);
		
		JLabel label = new JLabel("=");
		label.setBounds(211, 43, 25, 20);
		contentPane.add(label);

	}

}
