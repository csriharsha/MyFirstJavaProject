import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro {

	private JFrame frmConverter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
					window.frmConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConverter = new JFrame();
		frmConverter.setTitle("Converter");
		frmConverter.setBackground(new Color(240, 240, 240));
		frmConverter.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 16));
		frmConverter.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmConverter.getContentPane().setForeground(new Color(128, 128, 128));
		frmConverter.setBounds(500, 500, 750, 500);
		frmConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConverter.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUICK CONVERTER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(198, 60, 357, 43);
		frmConverter.getContentPane().add(lblNewLabel);
		
		JButton btnMoveToMeasu = new JButton("Move to workspace");
		btnMoveToMeasu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Measurements m = new Measurements();
				m.setVisible(true);
				frmConverter.dispose();
				
			}
		});
		btnMoveToMeasu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMoveToMeasu.setBounds(252, 200, 241, 43);
		frmConverter.getContentPane().add(btnMoveToMeasu);
	}
}
