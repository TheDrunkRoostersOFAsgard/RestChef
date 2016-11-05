package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * clase para crear la ventana para editar las recetas
 * @author Hernaldo
 *
 */
public class EditorReceta extends JFrame {

	private JPanel contentPane;


	/**
	 * se crea la ventana.
	 */
	public EditorReceta() {
		setTitle("Editar Receta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(102, 56, 67, 16);
		contentPane.add(editorPane);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(20, 595, 61, 16);
		contentPane.add(lblPrecio);
		
		JLabel lblRefers = new JLabel("Referencias:");
		lblRefers.setBounds(185, 595, 82, 16);
		contentPane.add(lblRefers);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(43, 624, 79, 16);
		contentPane.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(280, 595, 209, 63);
		contentPane.add(editorPane_2);
		
		JLabel lblComents = new JLabel("Comentarios:");
		lblComents.setBounds(526, 595, 95, 16);
		contentPane.add(lblComents);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(621, 595, 318, 56);
		contentPane.add(editorPane_3);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBounds(128, 142, 345, 16);
		contentPane.add(editorPane_6);
		
		JEditorPane editorPane_14 = new JEditorPane();
		editorPane_14.setBounds(747, 84, 216, 294);
		contentPane.add(editorPane_14);
		
		JLabel lblIngredientesDeLa = new JLabel("Ingredientes:");
		lblIngredientesDeLa.setBounds(795, 56, 95, 16);
		contentPane.add(lblIngredientesDeLa);
		
		JButton button = new JButton("Ordenes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
			}
		});
		button.setBounds(285, 0, 77, 22);
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
		button_1.setBounds(360, 0, 113, 22);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Menú");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(472, 0, 61, 22);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Recetas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(526, 0, 77, 22);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Inventario");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(601, 0, 82, 22);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Chat");
		button_5.setBounds(674, 0, 61, 22);
		contentPane.add(button_5);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(128, 103, 345, 16);
		contentPane.add(editorPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(128, 184, 345, 16);
		contentPane.add(editorPane_5);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBounds(128, 226, 345, 16);
		contentPane.add(editorPane_7);
		
		JEditorPane editorPane_8 = new JEditorPane();
		editorPane_8.setBounds(128, 266, 345, 16);
		contentPane.add(editorPane_8);
		
		JEditorPane editorPane_9 = new JEditorPane();
		editorPane_9.setBounds(128, 304, 345, 16);
		contentPane.add(editorPane_9);
		
		JEditorPane editorPane_10 = new JEditorPane();
		editorPane_10.setBounds(128, 344, 345, 16);
		contentPane.add(editorPane_10);
		
		JEditorPane editorPane_11 = new JEditorPane();
		editorPane_11.setBounds(128, 382, 345, 16);
		contentPane.add(editorPane_11);
		
		JEditorPane editorPane_12 = new JEditorPane();
		editorPane_12.setBounds(128, 420, 345, 16);
		contentPane.add(editorPane_12);
		
		JLabel lblPasosReceta = new JLabel("Pasos");
		lblPasosReceta.setBounds(102, 84, 95, 16);
		contentPane.add(lblPasosReceta);
	}
}
