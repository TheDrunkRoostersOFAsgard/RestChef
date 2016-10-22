package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TareasporOrden extends JFrame {

	private JPanel contentPane;
	
	ChefPrincipal chefprincipal =new ChefPrincipal();
	

	/**
	 * Create the frame.
	 */
	public TareasporOrden() {
		setTitle("Tareas Por Orden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Inicio = new JButton("Inicio");
		Inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chefprincipal.setVisible(true);
				dispose();
			}
		});
		Inicio.setBounds(0, 0, 48, 22);
		contentPane.add(Inicio);
		
		JButton Ordenes = new JButton("Ordenes");
		Ordenes.setBounds(45, 0, 67, 22);
		contentPane.add(Ordenes);
		
		JButton Tareas = new JButton("Tareas Actuales");
		Tareas.setBackground(new Color(255, 248, 220));
		Tareas.setForeground(Color.BLACK);
		Tareas.setBounds(111, 0, 109, 22);
		contentPane.add(Tareas);
		
		JButton Menu = new JButton("Menú");
		Menu.setBounds(219, 0, 54, 22);
		contentPane.add(Menu);
		
		JButton Recetas = new JButton("Recetas");
		Recetas.setBounds(272, 0, 61, 22);
		contentPane.add(Recetas);
		
		JButton Inventario = new JButton("Inventario");
		Inventario.setBounds(332, 0, 72, 22);
		contentPane.add(Inventario);
		
		JButton button = new JButton("Chat");
		button.setBounds(396, 0, 54, 22);
		contentPane.add(button);
		
		JLabel Tarealabel = new JLabel("Tarea");
		Tarealabel.setBounds(70, 47, 48, 16);
		contentPane.add(Tarealabel);
		
		JLabel lblChef = new JLabel("Chef");
		lblChef.setBounds(196, 47, 41, 16);
		contentPane.add(lblChef);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(325, 47, 48, 16);
		contentPane.add(lblEstado);
	}

}
