package Enfermeria;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class QR extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public QR() {
		setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBounds(10, 0, 439, 381);
		add(contentPane);
		
		JLabel lblNewLabel = new JLabel("CODIGO QR");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 20));
		lblNewLabel.setBounds(201, 11, 93, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBackground(Color.GRAY);
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 77, 155, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 119, 192, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 168, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("ESCANEA EL QR:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(62, 291, 120, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lbqr = new JLabel("QR");
		lbqr.setHorizontalAlignment(SwingConstants.CENTER);
		lbqr.setFont(new Font("Arial", Font.PLAIN, 13));
		lbqr.setBackground(new Color(153, 153, 255));
		lbqr.setBounds(278, 246, 129, 104);
		contentPane.add(lbqr);
		
		JLabel lblNewLabel_2 = new JLabel("NO. CONTROL:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBackground(new Color(204, 255, 204));
		lblNewLabel_2.setBounds(42, 90, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btgen = new JButton("GENERAR");
		btgen.setFont(new Font("Arial", Font.PLAIN, 11));
		btgen.setBackground(new Color(153, 153, 255));
		btgen.setBounds(192, 212, 89, 23);
		contentPane.add(btgen);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(20, 11, 94, 31);
		contentPane.add(lblNewLabel_6);

	}

}
