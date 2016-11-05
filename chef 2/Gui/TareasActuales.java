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
/**
 * clase en la que se crea la ventana de las tareas actuales, divididas por chef
 * @author Hernaldo
 *
 */
public class TareasActuales extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * constructor de la ventana.
	 */
	public TareasActuales() {
		setTitle("Tareas Actuales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane Orden1 = new JEditorPane();
		Orden1.setBounds(153, 130, 130, 16);
		contentPane.add(Orden1);
		
		JEditorPane Orden2 = new JEditorPane();
		Orden2.setBounds(153, 175, 130, 16);
		contentPane.add(Orden2);
		
		JEditorPane Orden3 = new JEditorPane();
		Orden3.setBounds(153, 355, 130, 16);
		contentPane.add(Orden3);
		
		JEditorPane Orden4 = new JEditorPane();
		Orden4.setBounds(153, 400, 130, 16);
		contentPane.add(Orden4);
		
		JEditorPane Orden5 = new JEditorPane();
		Orden5.setBounds(153, 220, 130, 16);
		contentPane.add(Orden5);
		
		JEditorPane Orden6 = new JEditorPane();
		Orden6.setBounds(153, 265, 130, 16);
		contentPane.add(Orden6);
		
		JEditorPane Orden7 = new JEditorPane();
		Orden7.setBounds(153, 310, 130, 16);
		contentPane.add(Orden7);
		
		JLabel lblOrdenes = new JLabel("Tareas");
		lblOrdenes.setBounds(200, 90, 61, 16);
		contentPane.add(lblOrdenes);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(500, 90, 61, 16);
		contentPane.add(lblEstado);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(800, 90, 61, 16);
		contentPane.add(lblTiempo);
		
		JButton button = new JButton("Ordenes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
			}
		});
		button.setBounds(256, 0, 87, 22);
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
		button_1.setBounds(342, 0, 124, 22);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Menú");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(460, 0, 72, 22);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Recetas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(531, 0, 61, 22);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Inventario");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(591, 0, 72, 22);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Chat");
		button_5.setBounds(658, 0, 48, 22);
		contentPane.add(button_5);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(153, 445, 130, 16);
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(153, 490, 130, 16);
		contentPane.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(153, 535, 130, 16);
		contentPane.add(editorPane_2);
	}

}
