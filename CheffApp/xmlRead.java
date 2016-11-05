package CheffApp;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Lectura de archivos .xml
 * @author Gerardo
 *
 */
public class xmlRead {

	public xmlRead(){}
	
	/**
	 * 
	 * @return lista con los elementos del .xml
	 * @throws JAXBException
	 */
	public ArrayList<item> Inventario() throws JAXBException{
		JAXBContext context =JAXBContext.newInstance(inventario.class); 
		Unmarshaller ums = context.createUnmarshaller();
		inventario inv = (inventario) ums.unmarshal(new File("C:\\Users\\Clemen\\workspace\\RestServer\\Ingredientes.xml"));
		ArrayList<item> lista = inv.getIngredientes();
		return lista;
		
		
	}
	/**
	 * 
	 * @return lista con los elementos del .xml
	 * @throws JAXBException
	 */
	public ArrayList<platillo> Menu() throws JAXBException{
		JAXBContext context =JAXBContext.newInstance(Menu.class); 
		Unmarshaller ums = context.createUnmarshaller();
		Menu inv = (Menu) ums.unmarshal(new File("C:\\Users\\Clemen\\workspace\\RestServer\\Menu.xml"));
		ArrayList<platillo> lista = inv.getPlatillos();
		return lista;
		
	}
}
