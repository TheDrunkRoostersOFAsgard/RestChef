package CheffApp;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * aqui se maneja la raiz del archivo Ingredientes.xml
 * @author Gerardo
 *
 */
@XmlRootElement(name="Inventario")
public class inventario {
	private ArrayList<item> ingredientes = new ArrayList<>();
	public inventario(){}
	
	@XmlElementWrapper(name="Ingredientes")
	@XmlElement(name="item")
	public ArrayList<item> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<item> ingredientes) {
		this.ingredientes = ingredientes;
	}
	

}
