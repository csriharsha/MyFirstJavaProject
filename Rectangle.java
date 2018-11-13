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

public class Rectangle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCompute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rectangle frame = new Rectangle();
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
	public Rectangle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeighth = new JLabel("Height(h) =");
		lblHeighth.setBounds(15, 16, 84, 20);
		contentPane.add(lblHeighth);
		
		JLabel lblBreadthb = new JLabel("Breadth(b) =");
		lblBreadthb.setBounds(15, 50, 92, 20);
		contentPane.add(lblBreadthb);
		
		textField = new JTextField();
		textField.setBounds(106, 13, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 47, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPerimeterh = new JLabel("Perimeter = 2*(h + b) =");
		lblPerimeterh.setBounds(15, 104, 177, 20);
		contentPane.add(lblPerimeterh);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 101, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblArea = new JLabel("Area = h*b =");
		lblArea.setBounds(15, 140, 108, 20);
		contentPane.add(lblArea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 137, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(298, 199, 115, 29);
		contentPane.add(btnBack);
		
		btnCompute = new JButton("compute");
		btnCompute.setBounds(15, 199, 115, 29);
		contentPane.add(btnCompute);
	}

}
