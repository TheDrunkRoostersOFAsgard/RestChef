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
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
/**
 * clase para crear la ventana de recetas
 * @author Hernaldo
 *
 */
public class Recetas extends JFrame {
	JButton Platillo1 = new JButton("");
	JButton Platillo2 = new JButton("");
	JButton Platillo3 = new JButton("");
	JButton Platillo4 = new JButton("");
	JButton Platillo5 = new JButton("");
	JButton Platillo6 = new JButton("");
	JButton Bebida1 = new JButton("");
	JButton Bebida2 = new JButton("");
	JButton Bebida3 = new JButton("");
	JButton Bebida4 = new JButton("");
	JButton Bebida5 = new JButton("");
	JButton Bebida6 = new JButton("");
	/**
	 * metodo que llama al get para solicitar info del servidor para la ventana de recetas del chef
	 */
	public void recetasdemenu(){
		int contplatos=0;
		int contbebidas=0;
		JButton[] listaplatillos= {Platillo1, Platillo2, Platillo3,Platillo4,Platillo5,Platillo6};
		JButton[] listabebidas= {Bebida1, Bebida2, Bebida3,Bebida4,Bebida5,Bebida6};
		JSONArray datos;
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
					boton.setText((String) tipo.get("nombre"));
					contplatos++;
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
	
	
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	
	public Recetas() {
		
		setTitle("Recetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlatosPrincipales = new JLabel("Platillos:");
		lblPlatosPrincipales.setBounds(215, 90, 127, 16);
		contentPane.add(lblPlatosPrincipales);
		
		JLabel lblBebidas = new JLabel("Bebidas:");
		lblBebidas.setBounds(600, 90, 61, 16);
		contentPane.add(lblBebidas);
		
		JButton button_2 = new JButton("Ordenes");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.chefprincipal.setVisible(true);
				dispose();
				
			}
		});
		button_2.setBounds(272, 0, 88, 22);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Tareas Actuales");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.t_actuales.setVisible(true);
				dispose();
			}
		});
		button_3.setBounds(358, 0, 113, 22);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Menú");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		button_4.setBounds(466, 0, 61, 22);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Recetas");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		button_5.setBounds(526, 0, 65, 22);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Inventario");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		button_6.setBounds(590, 0, 79, 22);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Chat");
		button_7.setBounds(669, 0, 53, 22);
		contentPane.add(button_7);
		
		
		Platillo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		Platillo1.setBounds(158, 118, 217, 29);
		contentPane.add(Platillo1);
		
		
		Platillo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		Platillo2.setBounds(158, 174, 217, 29);
		contentPane.add(Platillo2);
		
		
		Platillo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		Platillo3.setBounds(158, 228, 217, 29);
		contentPane.add(Platillo3);
		
		
		Platillo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
				
			}
			
		});
		Platillo4.setBounds(158, 280, 217, 29);
		contentPane.add(Platillo4);
		
		
		Platillo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		Platillo5.setBounds(158, 337, 217, 29);
		contentPane.add(Platillo5);
		
		
		Platillo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		Platillo6.setBounds(158, 396, 217, 29);
		contentPane.add(Platillo6);
		Bebida1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida1.setBounds(569, 124, 217, 29);
		contentPane.add(Bebida1);
		Bebida2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida2.setBounds(569, 174, 217, 29);
		contentPane.add(Bebida2);
		Bebida3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida3.setBounds(569, 228, 217, 29);
		contentPane.add(Bebida3);
		Bebida4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida4.setBounds(569, 280, 217, 29);
		contentPane.add(Bebida4);
		Bebida5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida5.setBounds(569, 337, 217, 29);
		contentPane.add(Bebida5);
		Bebida6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.editar.setVisible(true);
				dispose();
			}
		});
		
		
		Bebida6.setBounds(569, 396, 217, 29);
		contentPane.add(Bebida6);
		recetasdemenu();
	}
	
}
