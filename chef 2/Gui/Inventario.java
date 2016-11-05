package Gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import toServer.GET;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
/**
 * clase para crear la ventana de inventario
 * @author Hernaldo
 *
 */
public class Inventario extends JFrame {
	
	private String seleccionado;
	private JPanel contentPane;
	private JTextField Ingrediente;
	private JTextField CantidadIngre;
	JTextPane Inventariolista = new JTextPane();
	
	

	

	
	
	/**
	 * crear ventana.
	 */
	public Inventario() {
		setTitle("Inventario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Ordenes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
			}
		});
		button.setBounds(286, 0, 72, 22);
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
		button_1.setBounds(357, 0, 109, 22);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Menú");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(463, 0, 72, 22);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Recetas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(532, 0, 78, 22);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Inventario");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(605, 0, 78, 22);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Chat");
		button_5.setBounds(681, 0, 55, 22);
		contentPane.add(button_5);
		/**
		 * metodo que llama al get para solicitar informacion del servidor
		 */
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionado=(String) comboBox.getSelectedItem();
				JSONArray datos;
				try {
					datos = GET.readJsonFromUrl("http://192.168.1.52:9080/RestServer/clientes/inventario");
					String agregar="";
					
					for(int i=0; i<datos.length();i++){
						JSONObject tipo = (JSONObject) datos.get(i);
						if (tipo.get("type").equals(seleccionado)){
							
							agregar+= tipo.getString("nombre")+"\t"+"\t"+"\t" +tipo.getInt("cantidad")+"\n";
						}
						Inventariolista.setText(agregar);
						
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Carne", "Lacteo", "Verdura", "Grano", "Fruta"}));
		comboBox.setBounds(125, 136, 109, 27);
		contentPane.add(comboBox);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(186, 184, 117, 29);
		contentPane.add(btnAgregar);
		
		Ingrediente = new JTextField();
		Ingrediente.setBounds(336, 135, 130, 26);
		contentPane.add(Ingrediente);
		Ingrediente.setColumns(10);
		
		CantidadIngre = new JTextField();
		CantidadIngre.setBounds(252, 135, 37, 26);
		contentPane.add(CantidadIngre);
		CantidadIngre.setColumns(10);
		
		
		Inventariolista.setEditable(false);
		Inventariolista.setBounds(168, 279, 647, 359);
		contentPane.add(Inventariolista);
	}
}
