package Enfermeria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreacionQR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnc;
	private JTextField txtnom;
	private JTextField txtgru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreacionQR frame = new CreacionQR();
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
	public CreacionQR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODIGO QR");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(201, 11, 93, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE:");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(42, 129, 72, 0);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NOMBRE:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(74, 122, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GRUPO:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(84, 171, 51, 14);
		contentPane.add(lblNewLabel_4);
	
		
		txtnc = new JTextField();
		txtnc.setBounds(171, 77, 155, 20);
		contentPane.add(txtnc);
		txtnc.setColumns(10);
		
		txtnom = new JTextField();
		txtnom.setBounds(170, 119, 192, 20);
		contentPane.add(txtnom);
		txtnom.setColumns(10);
		
		txtgru = new JTextField();
		txtgru.setBounds(170, 168, 86, 20);
		contentPane.add(txtgru);
		txtgru.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ESCANEA EL QR:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(62, 291, 120, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lbqr = new JLabel("QR");
		lbqr.setBackground(new Color(153, 153, 255));
		lbqr.setHorizontalAlignment(SwingConstants.CENTER);
		lbqr.setFont(new Font("Arial", Font.PLAIN, 13));
		lbqr.setBounds(278, 246, 129, 104);
		contentPane.add(lbqr);
		
		JLabel lblNewLabel_2 = new JLabel("NO. CONTROL:");
		lblNewLabel_2.setBackground(new Color(204, 255, 204));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(42, 90, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btgen = new JButton("GENERAR");
		btgen.setFont(new Font("Arial", Font.PLAIN, 11));
		btgen.setBackground(new Color(153, 153, 255));
		btgen.setBounds(192, 212, 89, 23);
		contentPane.add(btgen);
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\52551\\Pictures\\LOGO JANP (8).jpg"));
		lblNewLabel_6.setBounds(20, 11, 94, 31);
		contentPane.add(lblNewLabel_6);
	}
}
