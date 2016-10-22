package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChefSingIn extends JFrame {

	private JPanel contentPane;
	private JTextField txt_username;
	private JPasswordField txt_password;

	ChefPrincipal chefprincipal =new ChefPrincipal();
	/**
	 * Create the frame.
	 */
	public ChefSingIn() {
		setTitle("CHEFAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLinkedinUser = new JLabel("LinkedIn User");
		lblLinkedinUser.setBounds(181, 25, 93, 27);
		contentPane.add(lblLinkedinUser);
		
		JLabel UserNamelabel = new JLabel("User Name:");
		UserNamelabel.setBounds(68, 79, 72, 16);
		contentPane.add(UserNamelabel);
		
		JLabel Passwordlabel = new JLabel("Password:");
		Passwordlabel.setBounds(68, 125, 72, 16);
		contentPane.add(Passwordlabel);
		
		txt_username = new JTextField();
		txt_username.setBounds(152, 74, 130, 26);
		contentPane.add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(152, 120, 130, 26);
		contentPane.add(txt_password);
		
		JButton btnSingIn = new JButton("Sing In");
		btnSingIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Conectando...");
				chefprincipal.setVisible(true);
				dispose();
			}
		});
		btnSingIn.setBounds(122, 169, 117, 29);
		contentPane.add(btnSingIn);
	}
}
