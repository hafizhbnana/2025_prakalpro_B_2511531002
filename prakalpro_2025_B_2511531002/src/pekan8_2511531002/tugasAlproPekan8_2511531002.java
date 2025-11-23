package pekan8_2511531002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class tugasAlproPekan8_2511531002 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
	private final JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
	private final JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
	private final JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
	private final JTextField txtBil1 = new JTextField();
	private final JTextField txtBil2 = new JTextField();
	private final JComboBox cbOperator = new JComboBox();
	private final JTextField txtHasil = new JTextField();
	private final JButton btnNewButton = new JButton("Proses");
	
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasAlproPekan8_2511531002 frame = new tugasAlproPekan8_2511531002();
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
	public tugasAlproPekan8_2511531002() {
		setTitle("OPERATOR ASSIGNMENT");
		txtBil1.setBounds(100, 70, 64, 19);
		txtBil1.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(86, 25, 176, 19);
		lblNewLabel.setFont(new Font("Lilita One", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(21, 69, 82, 19);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(21, 98, 82, 19);
		
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(21, 127, 82, 19);
		
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(21, 172, 82, 19);
		
		contentPane.add(lblNewLabel_1_1_1_1);
		
		contentPane.add(txtBil1);
		txtBil2.setColumns(10);
		txtBil2.setBounds(100, 99, 64, 19);
		
		contentPane.add(txtBil2);
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(100, 127, 42, 21);
		
		contentPane.add(cbOperator);
		txtHasil.setColumns(10);
		txtHasil.setBounds(100, 173, 64, 19);
		
		contentPane.add(txtHasil);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi!");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi!");
				} else {
					int a = 0;
					try {
						a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						if (c == 0) {
							a += b;
						}
						if (c == 1) {
							a -= b;
						}
						if (c == 2) {
							a *= b;
						}
						if (c == 3) {
							if (b == 0) {
								pesanError("Pembagian dengan 0 tidak boleh!");
								return;
							}
							a /= b;
						}
						if (c == 4) {
							if (b == 0) {
								pesanError("Modulus dengan 0 tidak boleh!");
								return;
							}
							a %= b;
						}
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan Bilangan 2 harus angka!");
						return;
					}
					
					
					txtHasil.setText(String.valueOf(a));
				}
			}
		});
		btnNewButton.setBounds(152, 127, 85, 21);
		
		contentPane.add(btnNewButton);

	}
}
