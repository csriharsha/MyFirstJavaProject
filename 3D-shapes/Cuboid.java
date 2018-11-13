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

public class Cuboid extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuboid frame = new Cuboid();
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
	public Cuboid() {
		setTitle("Cuboid");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 300, 550, 390);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.LIGHT_GRAY, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeighth = new JLabel("Height(h) =");
		lblHeighth.setBounds(29, 37, 92, 20);
		contentPane.add(lblHeighth);
		
		JLabel lblWidthw = new JLabel("Length(l) =");
		lblWidthw.setBounds(29, 73, 81, 20);
		contentPane.add(lblWidthw);
		
		JLabel lblBreadthb = new JLabel("Breadth(b) =");
		lblBreadthb.setBounds(29, 109, 92, 20);
		contentPane.add(lblBreadthb);
		
		textField = new JTextField();
		textField.setBounds(122, 34, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 70, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 106, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSurfaceArea = new JLabel("Surface area = 2*[(l*b)+(b*h)+(l*h)] =");
		lblSurfaceArea.setBounds(29, 173, 299, 20);
		contentPane.add(lblSurfaceArea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(325, 170, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblVolumeLbh = new JLabel("Volume = l*b*h =");
		lblVolumeLbh.setBounds(39, 223, 133, 20);
		contentPane.add(lblVolumeLbh);
		
		textField_4 = new JTextField();
		textField_4.setBounds(181, 220, 146, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				String s3 = textField_2.getText();
				double h = Double.parseDouble(s1);
				double l = Double.parseDouble(s2);
				double b = Double.parseDouble(s3);
				double area = 2*((l*h) + (l*b) + (b*h));
				double volume = l*b*h;
				textField_3.setText(String.valueOf(area));
				textField_4.setText(String.valueOf(volume));
			}
		});
		btnCompute.setBounds(29, 290, 115, 29);
		contentPane.add(btnCompute);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(373, 290, 115, 29);
		contentPane.add(btnBack);
	}

}
