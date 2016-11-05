package CheffApp;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Raiz del archivo xml menu
 * @author Gerardo
 *
 */
@XmlRootElement(name="Menu")
public class Menu {
	private ArrayList<platillo> platillos = new ArrayList<>();
	
	public Menu(){}

	@XmlElementWrapper(name="platillos")
	@XmlElement(name="platillo")
	public ArrayList<platillo> getPlatillos() {
		return platillos;
	}

	public void setPlatillos(ArrayList<platillo> platillos) {
		this.platillos = platillos;
	}
	
	

}
