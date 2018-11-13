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
import javax.swing.border.EtchedBorder;

public class Sphere extends JFrame {

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
					Sphere frame = new Sphere();
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
	public Sphere() {
		setTitle("Sphere");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 300, 550, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRadiusr = new JLabel("Radius(r) =");
		lblRadiusr.setBounds(30, 51, 91, 20);
		contentPane.add(lblRadiusr);
		
		textField = new JTextField();
		textField.setBounds(122, 48, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSurfaceArea = new JLabel("Surface area =");
		lblSurfaceArea.setBounds(30, 118, 109, 20);
		contentPane.add(lblSurfaceArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 115, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblVolume = new JLabel("Volume =");
		lblVolume.setBounds(30, 157, 91, 20);
		contentPane.add(lblVolume);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 154, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				double r = Double.parseDouble(s1);
				
				double area = 4*3.1416*r*r;
				double volume = (4*3.1416*r*r*r)/3;
				textField_1.setText(String.valueOf(area));
				textField_2.setText(String.valueOf(volume));
			}
		});
		btnCompute.setBounds(30, 241, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(359, 241, 115, 29);
		contentPane.add(btnBack);
	}

}
