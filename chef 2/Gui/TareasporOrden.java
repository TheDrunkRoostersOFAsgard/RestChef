package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
/**
 *  clase para crear la ventana en la que se desglosan las cada recetas en pasos y se le divide por chef
 * @author Hernaldo
 *
 */
public class TareasporOrden extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Constructor de la ventana.
	 */
	public TareasporOrden() {
		setTitle("Tareas por Orden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Tarealabel = new JLabel("Tareas");
		Tarealabel.setBounds(200, 90, 48, 16);
		contentPane.add(Tarealabel);
		
		JLabel lblChef = new JLabel("Chef");
		lblChef.setBounds(500, 90, 41, 16);
		contentPane.add(lblChef);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(800, 90, 48, 16);
		contentPane.add(lblEstado);
		
		JButton button = new JButton("Ordenes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
			}
		});
		button.setBounds(254, 0, 72, 22);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Tareas Actuales");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.t_actuales.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(255, 248, 220));
		button_1.setBounds(324, 0, 116, 22);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Menú");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(439, 0, 61, 22);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Recetas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(499, 0, 75, 22);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Inventario");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(573, 0, 79, 22);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Chat");
		button_5.setBounds(649, 0, 55, 22);
		contentPane.add(button_5);
	}

}
