package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheftoServer extends JFrame {

	private JPanel contentPane;
	private JTextField ipnumber;
	private JTextField portnumber;
	
	ChefSingIn chefsingin =new ChefSingIn();
	/**
	 * Create the frame.
	 */
	public CheftoServer() {
		setTitle("CHEFAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IP = new JLabel("IP:");
		IP.setBounds(124, 83, 27, 16);
		contentPane.add(IP);
		
		ipnumber = new JTextField();
		ipnumber.setBounds(163, 78, 130, 26);
		contentPane.add(ipnumber);
		ipnumber.setColumns(10);
		
		JLabel lblPort = new JLabel("PORT:");
		lblPort.setBounds(111, 130, 37, 16);
		contentPane.add(lblPort);
		
		portnumber = new JTextField();
		portnumber.setBounds(163, 125, 130, 26);
		contentPane.add(portnumber);
		portnumber.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Conectando...");
				chefsingin.setVisible(true);
				dispose();
			}
		});
		btnConnect.setBounds(143, 188, 117, 29);
		contentPane.add(btnConnect);
	}

}
