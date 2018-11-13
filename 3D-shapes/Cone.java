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

public class Cone extends JFrame {

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
					Cone frame = new Cone();
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
	public Cone() {
		setTitle("Cone");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 300, 550, 385);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeighth = new JLabel("Height(h) =");
		lblHeighth.setBounds(27, 42, 84, 20);
		contentPane.add(lblHeighth);
		
		JLabel lblRadiusr = new JLabel("Radius(r) =");
		lblRadiusr.setBounds(27, 87, 84, 20);
		contentPane.add(lblRadiusr);
		
		textField = new JTextField();
		textField.setBounds(118, 39, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 84, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurfaceArea = new JLabel("Surface area = pi*r(r+sqrt(r^2+h^2)) =");
		lblSurfaceArea.setBounds(27, 157, 292, 20);
		contentPane.add(lblSurfaceArea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(323, 154, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblVolume = new JLabel("Volume = (pi*r*r*h)/3 =");
		lblVolume.setBounds(27, 209, 190, 20);
		contentPane.add(lblVolume);
		
		textField_3 = new JTextField();
		textField_3.setBounds(214, 206, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCompute = new JButton("compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				double h = Double.parseDouble(s1);
				double r = Double.parseDouble(s2);
				
				double area = 3.1416*r*(r+Math.sqrt((h*h + r*r)));
				double volume = (3.1416*r*r*h)/3;
				textField_2.setText(String.valueOf(area));
				textField_3.setText(String.valueOf(volume));
			}
		});
		btnCompute.setBounds(25, 282, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(377, 282, 115, 29);
		contentPane.add(btnBack);
	}

}
