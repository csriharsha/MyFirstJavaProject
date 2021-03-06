import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class Measurements extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Measurements frame = new Measurements();
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
	public Measurements() {
		setTitle("Measurement menu");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 580, 325);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Mass");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mass mass = new Mass();
				mass.setVisible(true);
			}
		});
		btnNewButton.setBounds(51, 49, 147, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Temperature");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Temperature temperature = new Temperature();
				temperature.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(51, 185, 147, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Length");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Length length = new Length();
				length.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(51, 94, 147, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Time");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Time time = new Time();
				time.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(51, 139, 147, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(378, 185, 115, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btndShapes = new JButton("2-D shapes");
		btndShapes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				twodimshape tds = new twodimshape();
				tds.setVisible(true);
			}
		});
		btndShapes.setBounds(362, 49, 147, 29);
		contentPane.add(btndShapes);
		
		JButton btndShapes_1 = new JButton("3-D shapes");
		btndShapes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threedimshape tds_1 = new threedimshape();
				tds_1.setVisible(true);
			}
		});
		btndShapes_1.setBounds(362, 94, 147, 29);
		contentPane.add(btndShapes_1);
		
	}
}
