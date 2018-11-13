import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;


public class threedimshape extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					threedimshape frame = new threedimshape();
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
	public threedimshape() {
		setTitle("Three dimensional shapes");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cuboid");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuboid cuboid = new Cuboid();
				cuboid.setVisible(true);
			}
		});
		btnNewButton.setBounds(32, 33, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cone");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cone cone = new Cone();
				cone.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(32, 79, 115, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnSphere = new JButton("Sphere");
		btnSphere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sphere sphere = new Sphere();
				sphere.setVisible(true);
			}
		});
		btnSphere.setBounds(32, 125, 115, 29);
		contentPane.add(btnSphere);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(278, 287, 115, 29);
		contentPane.add(btnBack);
		
		JButton btnCylinder = new JButton("Cylinder");
		btnCylinder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cylinder cylinder = new Cylinder();
				cylinder.setVisible(true);
			}
		});
		btnCylinder.setBounds(32, 170, 115, 29);
		contentPane.add(btnCylinder);
	}

}
