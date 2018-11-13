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

public class Cylinder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cylinder frame = new Cylinder();
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
	public Cylinder() {
		setTitle("Cylinder");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 300, 550, 345);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.LIGHT_GRAY, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRadiusr = new JLabel("Radius(r) =");
		lblRadiusr.setBounds(31, 38, 98, 20);
		contentPane.add(lblRadiusr);
		
		JLabel lblHeighth = new JLabel("Height(h) =");
		lblHeighth.setBounds(31, 70, 98, 20);
		contentPane.add(lblHeighth);
		
		JLabel lblArea = new JLabel("Area = 2*pi*r(h+r) =");
		lblArea.setBounds(31, 127, 178, 20);
		contentPane.add(lblArea);
		
		JLabel lblVolumePirrh = new JLabel("Volume = pi*r*r*h =");
		lblVolumePirrh.setBounds(31, 164, 154, 20);
		contentPane.add(lblVolumePirrh);
		
		textField = new JTextField();
		textField.setBounds(126, 35, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 67, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 124, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 161, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				double r = Double.parseDouble(s1);
				double h = Double.parseDouble(s2);
				
				double area = 2*3.1416*r*(h+r);
				double volume = 3.1416*r*r*h;
				textField_2.setText(String.valueOf(area));
				textField_3.setText(String.valueOf(volume));
			}
		});
		btnNewButton.setBounds(31, 241, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(374, 241, 115, 29);
		contentPane.add(btnBack);
	}

}
