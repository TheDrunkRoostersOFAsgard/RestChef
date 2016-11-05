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
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
/**
 * clase para crear la ventana de menu
 * @author Hernaldo
 *
 */
public class Menu extends JFrame {

	

	JButton platillo1 = new JButton();
	JButton platillo2 = new JButton();
	JButton platillo3 = new JButton();
	JButton platillo4 = new JButton();
	JButton platillo5 = new JButton();
	JButton platillo6 = new JButton();
	JButton precio1 = new JButton();
	JButton precio2 = new JButton();
	JButton precio3 = new JButton();
	JButton precio4 = new JButton();
	JButton precio5 = new JButton();
	JButton precio6 = new JButton();
	JButton bebida1 = new JButton();
	JButton bebida2 = new JButton();
	JButton bebida3 = new JButton();
	JButton bebida4 = new JButton();
	JButton bebida5 = new JButton();
	JButton bebida6 = new JButton();
	
	/**
	 * metodo que llama el get para solicitar la informacion del servidor
	 */
	public void getmenu(){
		
		int contbebidas=0;
		JButton[] listaplatillos= {platillo1, platillo2, platillo3,platillo4,platillo4,platillo6};
		int contplatos=0;
		JButton[] listabebidas= {bebida1, bebida2, bebida3,bebida4,bebida5,bebida6};
		JSONArray datos;
		int contprecio=0;
		JButton[] listaprecios= {precio1, precio2, precio3,precio4,precio5,precio6};
		try {
			datos = GET.readJsonFromUrl("http://192.168.1.52:9080/RestServer/clientes/menu");
			
			for(int i=0; i<datos.length();i++){
				JSONObject tipo = (JSONObject) datos.get(i);
				
				if(tipo.get("type").equals("Bebida")){
					JButton boton=listabebidas[contbebidas];
					boton.setText((String) tipo.get("nombre"));
					contbebidas++;
				}else if(tipo.get("type").equals("Comida")){
					JButton boton=listaplatillos[contplatos];
					JButton botoncito=listaprecios[contprecio];
					botoncito.setText((String) tipo.get("precio"));
					boton.setText((String) tipo.get("nombre"));
					contplatos++;
					contprecio++;
				}else if(tipo.get("type").equals("precio")){
					JButton boton=listaprecios[contprecio];
					boton.setText((String) tipo.get("nombre"));
					contprecio++;
				}
			}
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * crear ventana.
	 */
	public Menu() {
		
		setTitle("Menú");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		getContentPane().setLayout(null);
		
		
		platillo1.setBounds(210, 235, 87, 26);
		getContentPane().add(platillo1);
		
		
		JButton button = new JButton("Ordenes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
			}
		});
		button.setBounds(252, 0, 72, 22);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Tareas Actuales");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.t_actuales.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(255, 248, 220));
		button_1.setBounds(323, 0, 109, 22);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Menú");
		button_2.setBounds(429, 0, 72, 22);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Recetas");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(498, 0, 78, 22);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Inventario");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(571, 0, 78, 22);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Chat");
		button_5.setBounds(647, 0, 55, 22);
		getContentPane().add(button_5);
		
		JLabel lblPlatillos = new JLabel("Platillos:");
		lblPlatillos.setBounds(230, 167, 78, 16);
		getContentPane().add(lblPlatillos);
		
		JLabel label_2 = new JLabel("Bebidas:");
		label_2.setBounds(684, 167, 61, 16);
		getContentPane().add(label_2);
		
		
		
		platillo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChefSingIn.recetas.setVisible(true);
				dispose();
				
			}
		});
		platillo2.setBounds(210, 283, 87, 29);
		getContentPane().add(platillo2);
		
		
		platillo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
				
			}
		});
		platillo3.setBounds(210, 333, 87, 29);
		getContentPane().add(platillo3);
		
		
		bebida1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		bebida1.setBounds(669, 232, 87, 29);
		getContentPane().add(bebida1);
		
		
		bebida2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		bebida2.setBounds(669, 283, 87, 29);
		getContentPane().add(bebida2);
		
		
		bebida3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
				
			}
		});
		bebida3.setBounds(669, 333, 87, 29);
		getContentPane().add(bebida3);
		
		JLabel lblPrecios = new JLabel("Precios");
		lblPrecios.setBounds(366, 167, 78, 16);
		getContentPane().add(lblPrecios);
		
		precio1.setBounds(357, 235, 87, 26);
		getContentPane().add(precio1);
		
		precio2.setBounds(357, 283, 87, 26);
		getContentPane().add(precio2);
		
		precio3.setBounds(357, 325, 87, 26);
		getContentPane().add(precio3);
		
	
		getmenu();
	}
}
