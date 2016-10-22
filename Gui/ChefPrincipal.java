package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChefPrincipal extends JFrame {

	private JPanel contentPane;
	TareasporOrden Description = new TareasporOrden();
	/**
	 * Create the frame.
	 */
	
	public ChefPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOrdenes = new JButton("Ordenes");
		btnOrdenes.setBounds(0, 0, 69, 22);
		contentPane.add(btnOrdenes);
		
		JButton btnTareas = new JButton("Tareas Actuales");
		
		btnTareas.setBounds(65, 0, 120, 22);
		contentPane.add(btnTareas);
		
		JButton btnMenu = new JButton("Menú");
		btnMenu.setBounds(182, 0, 69, 22);
		contentPane.add(btnMenu);
		
		JButton btnRecetas = new JButton("Recetas");
		btnRecetas.setBounds(248, 0, 69, 22);
		contentPane.add(btnRecetas);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setBounds(313, 0, 75, 22);
		contentPane.add(btnInventario);
		
		JButton btnChat = new JButton("Chat");
		btnChat.setBounds(387, 0, 63, 22);
		contentPane.add(btnChat);
		
		JLabel ListaOrden = new JLabel("Orden");
		ListaOrden.setBounds(42, 39, 61, 16);
		contentPane.add(ListaOrden);
		
		JLabel Mesa = new JLabel("Mesa");
		Mesa.setBounds(136, 39, 61, 16);
		contentPane.add(Mesa);
		
		JLabel Categoría = new JLabel("Categoría");
		Categoría.setBounds(233, 39, 61, 16);
		contentPane.add(Categoría);
		
		JLabel Estado = new JLabel("Estado");
		Estado.setBounds(357, 39, 61, 16);
		contentPane.add(Estado);
		
		JButton Orden1 = new JButton();
		Orden1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden1.setBounds(16, 67, 87, 29);
		contentPane.add(Orden1);
		
		JButton Orden3 = new JButton();
		Orden3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden3.setBounds(16, 115, 87, 29);
		contentPane.add(Orden3);
		
		JButton Orden2 = new JButton();
		Orden2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden2.setBounds(16, 91, 87, 29);
		contentPane.add(Orden2);
		
		JButton Orden5 = new JButton();
		Orden5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden5.setBounds(16, 163, 87, 29);
		contentPane.add(Orden5);
		
		JButton Orden4 = new JButton();
		Orden4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden4.setBounds(16, 139, 87, 29);
		contentPane.add(Orden4);
		
		JButton Orden6 = new JButton();
		Orden6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden6.setBounds(16, 187, 87, 29);
		contentPane.add(Orden6);
		
		JButton Orden8 = new JButton();
		Orden8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden8.setBounds(16, 235, 87, 29);
		contentPane.add(Orden8);
		
		JButton Orden7 = new JButton();
		Orden7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description.setVisible(true);
				dispose();
			}
		});
		Orden7.setBounds(16, 211, 87, 29);
		contentPane.add(Orden7);
		
		JButton Mesa1 = new JButton();
		Mesa1.setBounds(110, 67, 87, 29);
		contentPane.add(Mesa1);
		
		JButton Mesa2 = new JButton();
		Mesa2.setBounds(110, 91, 87, 29);
		contentPane.add(Mesa2);
		
		JButton Mesa3 = new JButton();
		Mesa3.setBounds(110, 115, 87, 29);
		contentPane.add(Mesa3);
		
		JButton Mesa4 = new JButton();
		Mesa4.setBounds(110, 139, 87, 29);
		contentPane.add(Mesa4);
		
		JButton Mesa5 = new JButton();
		Mesa5.setBounds(110, 163, 87, 29);
		contentPane.add(Mesa5);
		
		JButton Mesa6 = new JButton();
		Mesa6.setBounds(110, 187, 87, 29);
		contentPane.add(Mesa6);
		
		JButton Mesa7 = new JButton();
		Mesa7.setBounds(110, 211, 87, 29);
		contentPane.add(Mesa7);
		
		JButton Mesa8 = new JButton();
		Mesa8.setBounds(110, 235, 87, 29);
		contentPane.add(Mesa8);
		
		JButton Categoría1 = new JButton();
		Categoría1.setBounds(230, 67, 87, 29);
		contentPane.add(Categoría1);
		
		JButton Categoría2 = new JButton();
		Categoría2.setBounds(230, 91, 87, 29);
		contentPane.add(Categoría2);
		
		JButton Categoría3 = new JButton();
		Categoría3.setBounds(230, 115, 87, 29);
		contentPane.add(Categoría3);
		
		JButton Categoría4 = new JButton();
		Categoría4.setBounds(230, 139, 87, 29);
		contentPane.add(Categoría4);
		
		JButton Categoría5 = new JButton();
		Categoría5.setBounds(230, 163, 87, 29);
		contentPane.add(Categoría5);
		
		JButton Categoría6 = new JButton();
		Categoría6.setBounds(230, 187, 87, 29);
		contentPane.add(Categoría6);
		
		JButton Categoría7 = new JButton();
		Categoría7.setBounds(230, 211, 87, 29);
		contentPane.add(Categoría7);
		
		JButton Categoría8 = new JButton();
		Categoría8.setBounds(230, 235, 87, 29);
		contentPane.add(Categoría8);
		
		JButton Estado1 = new JButton();
		Estado1.setBounds(331, 67, 87, 29);
		contentPane.add(Estado1);
		
		JButton Estado2 = new JButton();
		Estado2.setBounds(331, 91, 87, 29);
		contentPane.add(Estado2);
		
		JButton Estado3 = new JButton();
		Estado3.setBounds(331, 115, 87, 29);
		contentPane.add(Estado3);
		
		JButton Estado4 = new JButton();
		Estado4.setBounds(331, 139, 87, 29);
		contentPane.add(Estado4);
		
		JButton Estado5 = new JButton();
		Estado5.setBounds(331, 163, 87, 29);
		contentPane.add(Estado5);
		
		JButton Estado6 = new JButton();
		Estado6.setBounds(331, 187, 87, 29);
		contentPane.add(Estado6);
		
		JButton Estado7 = new JButton();
		Estado7.setBounds(331, 211, 87, 29);
		contentPane.add(Estado7);
		
		JButton Estado8 = new JButton();
		Estado8.setBounds(331, 235, 87, 29);
		contentPane.add(Estado8);
	}
}
