package Enfermeria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtent;
	private JTextField txtmot;
	private JTextField txtsal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	private Consulta ventanaConsulta;
	
	public Consulta() {
		
		ventanaConsulta = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(158, 11, 111, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\52551\\Pictures\\LOGO JANP (8).jpg"));
		lblNewLabel_1.setBounds(10, 11, 94, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(158, 87, -110, -2);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOMBRE:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(89, 111, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO. CONTROL:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(58, 71, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GRUPO:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(96, 144, 54, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lbnc = new JLabel("................");
		lbnc.setBackground(new Color(255, 255, 255));
		lbnc.setFont(new Font("Arial", Font.PLAIN, 13));
		lbnc.setBounds(189, 71, 77, 14);
		contentPane.add(lbnc);
		
		JLabel lbnom = new JLabel(".................");
		lbnom.setBackground(new Color(255, 255, 255));
		lbnom.setBounds(189, 111, 80, 14);
		contentPane.add(lbnom);
		
		JLabel lbgru = new JLabel(".................");
		lbgru.setBackground(new Color(255, 255, 255));
		lbgru.setBounds(189, 144, 77, 14);
		contentPane.add(lbgru);
		
		JLabel lblNewLabel_6 = new JLabel("ENTRADA:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(83, 181, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MOTIVO:");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(96, 219, 54, 14);
		contentPane.add(lblNewLabel_7);
		
		txtent = new JTextField();
		txtent.setBounds(183, 178, 86, 20);
		contentPane.add(txtent);
		txtent.setColumns(10);
		
		txtmot = new JTextField();
		txtmot.setBounds(183, 209, 192, 64);
		contentPane.add(txtmot);
		txtmot.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("SALIDA:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(100, 291, 50, 14);
		contentPane.add(lblNewLabel_8);
		
		txtsal = new JTextField();
		txtsal.setBounds(183, 288, 86, 20);
		contentPane.add(txtsal);
		txtsal.setColumns(10);
		
		JButton btguar = new JButton("GUARDAR");
		btguar.setBackground(new Color(153, 153, 255));
		btguar.setFont(new Font("Arial", Font.PLAIN, 12));
		btguar.setBounds(56, 354, 94, 23);
		contentPane.add(btguar);
		
		JButton btreg = new JButton("REGRESAR");
		btreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Menu Menu = new Menu();
			Menu.setVisible(true);
			ventanaConsulta.dispose();
			}
		});
		btreg.setBackground(new Color(153, 153, 255));
		btreg.setFont(new Font("Arial", Font.PLAIN, 12));
		btreg.setBounds(189, 354, 111, 23);
		contentPane.add(btreg);
		
		JButton btsal = new JButton("SALIR");
		btsal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btsal.setBackground(new Color(153, 153, 255));
		btsal.setFont(new Font("Arial", Font.PLAIN, 12));
		btsal.setBounds(333, 354, 89, 23);
		contentPane.add(btsal);
	}

}
