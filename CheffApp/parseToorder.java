package CheffApp;

import java.util.ArrayList;

import javax.xml.bind.JAXBException;
/**
 * separa ingredientes del xml por tipos
 * @author Gerardo
 *
 */
public class parseToorder {
	private ArrayList<item> result;
	
	/**
	 * 
	 * @return Lista de los elementos segun el tipo
	 * @throws JAXBException
	 */
	public ArrayList<item> parseFrutas() throws JAXBException{
		xmlRead xml = new xmlRead();
		ArrayList<item> lista = xml.Inventario();
		
		for (int z=0; z<lista.size();z++){
			String type = lista.get(z).getType();
			if (type.equals("Fruta")){
				//result.add(lista.get(z).getNombre());
			}
		}
		return result;
	
		
	}
	

}
