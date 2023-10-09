package Enfermeria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 293);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M E N Ú");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel.setBounds(218, 11, 73, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\52551\\Pictures\\LOGO JANP (8).jpg"));
		lblNewLabel_1.setBounds(10, 11, 94, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btconsulta = new JButton("CONSULTA");
		btconsulta.setBackground(new Color(153, 153, 255));
		btconsulta.setFont(new Font("Arial", Font.PLAIN, 13));
		btconsulta.setBounds(90, 105, 119, 35);
		contentPane.add(btconsulta);
		
		JButton bthistorial = new JButton("HISTORIAL");
		bthistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bthistorial.setBackground(new Color(153, 153, 255));
		bthistorial.setFont(new Font("Arial", Font.PLAIN, 13));
		bthistorial.setBounds(283, 105, 112, 35);
		contentPane.add(bthistorial);
	}

}
