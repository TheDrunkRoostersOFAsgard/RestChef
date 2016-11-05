package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import toServer.GET;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
/**
 * clase para crear la ventana inicial del chef
 * @author Hernaldo
 *
 */
public class ChefPrincipal extends JFrame implements Runnable{

	private JPanel contentPane;
	TareasporOrden Description = new TareasporOrden();
	private Thread hilo;
	private String seleccionado;
	JButton orden1 = new JButton();
	JButton orden2 = new JButton();
	JButton orden3 = new JButton();
	JButton orden4 = new JButton();
	JButton orden5 = new JButton();
	JButton orden6 = new JButton();
	JButton orden7 = new JButton();
	JButton orden8 = new JButton();
	JButton mesa1 = new JButton();
	JButton mesa2 = new JButton();
	JButton mesa3 = new JButton();
	JButton mesa4 = new JButton();
	JButton mesa5 = new JButton();
	JButton mesa6 = new JButton();
	JButton mesa7 = new JButton();
	JButton mesa8 = new JButton();
	JButton cat1 = new JButton();
	JButton cat2 = new JButton();
	JButton cat3 = new JButton();
	JButton cat4 = new JButton();
	JButton cat5 = new JButton();
	JButton cat6 = new JButton();
	JButton cat7 = new JButton();
	JButton cat8 = new JButton();
	JButton est1 = new JButton();
	JButton est2 = new JButton();
	JButton est3 = new JButton();
	JButton est4 = new JButton();
	JButton est5 = new JButton();
	JButton est6 = new JButton();
	JButton est7 = new JButton();
	JButton est8 = new JButton();
	/**
	 * metodo que llama al get para solicitar informacion del servidor
	 */
	public void run(){
		int contordenes=0;
		int contmesa=0;
		int contcategoria=0;
		int contestado=0;
		JButton[] listaordenes= {orden1, orden2, orden3, orden4, orden5, orden6, orden7, orden8};
		JButton[] listamesa= {mesa1, mesa2, mesa3, mesa4, mesa5, mesa6, mesa7, mesa8};
		JButton[] listacategoria= {cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8};
		JButton[] listaestado= {est1, est2, est3, est4, est5, est6, est7, est8};
		try {
			while(true){
				JSONArray datos =GET.readJsonFromUrl("http://192.168.1.52:9080/RestServer/clientes/menu");
				for(int i=0; i<datos.length();i++){
					JSONObject tipo = (JSONObject) datos.get(i);
					if(tipo.get("type").equals("ordenes")){
						JButton boton = listaordenes[contordenes];
						boton.setText((String) tipo.get("nombre"));
						contordenes++;
					}else if(tipo.get("type").equals("mesa")){
						JButton boton=listamesa[contmesa];
						boton.setText((String) tipo.get("nombre"));
						contmesa++;
					}else if(tipo.get("type").equals("categoria")){
						JButton boton=listacategoria[contcategoria];
						boton.setText((String) tipo.get("nombre"));
						contcategoria++;
					}else if(tipo.get("type").equals("estado")){
						JButton boton=listaestado[contestado];
						boton.setText((String) tipo.get("nombre"));
						contestado++;
					}
				
				}
				Thread.sleep(1000);
			}
		}catch (Exception e) {
		// TODO: handle exception
		}
	}


		
	/**
	 * Crea la ventana.
	 */
	
	public ChefPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOrdenes = new JButton("Ordenes");
		btnOrdenes.setBounds(269, 0, 69, 22);
		contentPane.add(btnOrdenes);
		
		JButton btnTareas = new JButton("Tareas Actuales");
		btnTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.t_actuales.setVisible(true);
				dispose();
			}
		});
		
		btnTareas.setBounds(335, 0, 120, 22);
		contentPane.add(btnTareas);
		
		JButton btnMenu = new JButton("Menú");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setBounds(449, 0, 69, 22);
		contentPane.add(btnMenu);
		
		JButton btnRecetas = new JButton("Recetas");
		btnRecetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.recetas.setVisible(true);
				dispose();
			}
		});
		btnRecetas.setBounds(516, 0, 69, 22);
		contentPane.add(btnRecetas);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChefSingIn.inventario.setVisible(true);
				dispose();
			}
		});
		btnInventario.setBounds(583, 0, 75, 22);
		contentPane.add(btnInventario);
		
		JButton btnChat = new JButton("Chat");
		btnChat.setBounds(655, 0, 63, 22);
		contentPane.add(btnChat);
		
		JLabel label = new JLabel("Estado");
		label.setBounds(873, 139, 61, 16);
		contentPane.add(label);
		
		JButton est1 = new JButton();
		est1.setBounds(847, 167, 87, 29);
		contentPane.add(est1);
		
		JButton est2 = new JButton();
		est2.setBounds(847, 191, 87, 29);
		contentPane.add(est2);
		
		JButton est3 = new JButton();
		est3.setBounds(847, 215, 87, 29);
		contentPane.add(est3);
		
		JButton est4 = new JButton();
		est4.setBounds(847, 239, 87, 29);
		contentPane.add(est4);
		
		JButton est5 = new JButton();
		est5.setBounds(847, 263, 87, 29);
		contentPane.add(est5);
		
		JButton est6 = new JButton();
		est6.setBounds(847, 287, 87, 29);
		contentPane.add(est6);
		
		JButton est7 = new JButton();
		est7.setBounds(847, 311, 87, 29);
		contentPane.add(est7);
		
		JButton est8 = new JButton();
		est8.setBounds(847, 335, 87, 29);
		contentPane.add(est8);
		
		JLabel label_1 = new JLabel("Categoría");
		label_1.setBounds(574, 139, 61, 16);
		contentPane.add(label_1);
		
		
		cat1.setBounds(571, 167, 87, 29);
		contentPane.add(cat1);
		
		cat2.setBounds(571, 191, 87, 29);
		contentPane.add(cat2);
		
		cat3.setBounds(571, 215, 87, 29);
		contentPane.add(cat3);
		
		cat4.setBounds(571, 239, 87, 29);
		contentPane.add(cat4);
		
		cat5.setBounds(571, 263, 87, 29);
		contentPane.add(cat5);
		
		cat6.setBounds(571, 287, 87, 29);
		contentPane.add(cat6);
		
		cat7.setBounds(571, 311, 87, 29);
		contentPane.add(cat7);
		
		cat8.setBounds(571, 335, 87, 29);
		contentPane.add(cat8);
		
		JLabel label_2 = new JLabel("Mesa");
		label_2.setBounds(317, 139, 61, 16);
		contentPane.add(label_2);
		
		
		mesa1.setBounds(291, 167, 87, 29);
		contentPane.add(mesa1);
		
		
		mesa2.setBounds(291, 191, 87, 29);
		contentPane.add(mesa2);
		
		
		mesa3.setBounds(291, 215, 87, 29);
		contentPane.add(mesa3);
		
		
		mesa4.setBounds(291, 239, 87, 29);
		contentPane.add(mesa4);
		
		
		mesa5.setBounds(291, 263, 87, 29);
		contentPane.add(mesa5);
		
		
		mesa6.setBounds(291, 287, 87, 29);
		contentPane.add(mesa6);
		
		
		mesa7.setBounds(291, 311, 87, 29);
		contentPane.add(mesa7);
		
		
		mesa8.setBounds(291, 335, 87, 29);
		contentPane.add(mesa8);
		
		JLabel label_3 = new JLabel("Orden");
		label_3.setBounds(124, 139, 61, 16);
		contentPane.add(label_3);
		
		
		orden1.setBounds(98, 167, 87, 29);
		contentPane.add(orden1);
		
		
		orden2.setBounds(98, 191, 87, 29);
		contentPane.add(orden2);
		
	
		orden3.setBounds(98, 215, 87, 29);
		contentPane.add(orden3);
		
		
		orden4.setBounds(98, 239, 87, 29);
		contentPane.add(orden4);
		
		
		orden5.setBounds(98, 263, 87, 29);
		contentPane.add(orden5);
		
	
		orden6.setBounds(98, 287, 87, 29);
		contentPane.add(orden6);
		
		
		orden7.setBounds(98, 311, 87, 29);
		contentPane.add(orden7);
		
		
		orden8.setBounds(98, 335, 87, 29);
		contentPane.add(orden8);
		
		hilo=new Thread(this,"hilito");
		hilo.start();
	}
	
}


