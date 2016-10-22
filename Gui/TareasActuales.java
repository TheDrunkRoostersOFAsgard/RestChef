package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class TareasActuales extends JFrame {

	private JPanel contentPane;
	
	ChefPrincipal chefprincipal =new ChefPrincipal();
	/**
	 * Create the frame.
	 */
	public TareasActuales() {
		setTitle("Tareas Actuales");
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
		Ordenes.setBounds(48, 0, 67, 22);
		contentPane.add(Ordenes);
		
		JButton Tareas = new JButton("Tareas Actuales");
		Tareas.setForeground(Color.BLACK);
		Tareas.setBackground(new Color(255, 248, 220));
		Tareas.setBounds(114, 0, 109, 22);
		contentPane.add(Tareas);
		
		JButton Menu = new JButton("Menú");
		Menu.setBounds(222, 0, 54, 22);
		contentPane.add(Menu);
		
		JButton Recetas = new JButton("Recetas");
		Recetas.setBounds(275, 0, 61, 22);
		contentPane.add(Recetas);
		
		JButton Inventario = new JButton("Inventario");
		Inventario.setBounds(335, 0, 72, 22);
		contentPane.add(Inventario);
		
		JButton Chat = new JButton("Chat");
		Chat.setBounds(402, 0, 48, 22);
		contentPane.add(Chat);
		
		JEditorPane Orden1 = new JEditorPane();
		Orden1.setBounds(37, 77, 130, 16);
		contentPane.add(Orden1);
		
		JEditorPane Orden2 = new JEditorPane();
		Orden2.setBounds(37, 105, 130, 16);
		contentPane.add(Orden2);
		
		JEditorPane Orden3 = new JEditorPane();
		Orden3.setBounds(37, 133, 130, 16);
		contentPane.add(Orden3);
		
		JEditorPane Orden4 = new JEditorPane();
		Orden4.setBounds(37, 161, 130, 16);
		contentPane.add(Orden4);
		
		JEditorPane Orden5 = new JEditorPane();
		Orden5.setBounds(37, 189, 130, 16);
		contentPane.add(Orden5);
		
		JEditorPane Orden6 = new JEditorPane();
		Orden6.setBounds(37, 217, 130, 16);
		contentPane.add(Orden6);
		
		JEditorPane Orden7 = new JEditorPane();
		Orden7.setBounds(37, 245, 130, 16);
		contentPane.add(Orden7);
		
		JLabel lblOrdenes = new JLabel("Ordenes");
		lblOrdenes.setBounds(71, 34, 61, 16);
		contentPane.add(lblOrdenes);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(232, 34, 61, 16);
		contentPane.add(lblEstado);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(345, 34, 61, 16);
		contentPane.add(lblTiempo);
	}

}
