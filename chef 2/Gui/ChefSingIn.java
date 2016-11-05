package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * clase para crear la ventana de ingreso para linkedin
 * ademas instanciar las demas clases necesarias
 * @author Hernaldo
 *
 */
public class ChefSingIn extends JFrame {

	private JPanel contentPane;

	static ChefPrincipal chefprincipal =new ChefPrincipal();
	static TareasporOrden description = new TareasporOrden();
	static TareasActuales t_actuales = new TareasActuales();
	static Recetas recetas=new Recetas();
	static EditorReceta editar=new EditorReceta();
	static Inventario inventario=new Inventario();
	static Menu menu = new Menu();
	/**
	 * Create the frame.
	 */
	public ChefSingIn() {
		setTitle("CHEFAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSingIn = new JButton("Aceptar");
		btnSingIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if (true){
					JOptionPane.showMessageDialog(null, "Conectando...");
					chefprincipal.setVisible(true);
					//dispose();
				//}//else{
					
				//}
			}
		});
		btnSingIn.setBounds(431, 376, 117, 29);
		contentPane.add(btnSingIn);
		
		JLabel lblIniciarSecsnEn = new JLabel("Iniciar Sesión en LinkedIn ");
		lblIniciarSecsnEn.setBounds(403, 252, 184, 27);
		contentPane.add(lblIniciarSecsnEn);
	}
}
