package CheffApp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 * Escritura y creacion de archivos .xml
 * @author Gerado
 *
 */
public class xmlWrite {
	private String type;
	private String name;
	private String cant;
	
	public xmlWrite(){}
	
	/**
	 * 
	 * @param type tipo de ingrediente que se encuentra en el archivo
	 * @param name nombre del ingrediente en el xml
	 * @param cant cantidad del ingrediente en stock
	 * @throws JAXBException
	 * @throws IOException
	 */
	public void Inventario(String type,String name,String cant) throws JAXBException, IOException{
		this.type = type;
		this.name = name;
		this.cant = cant;
		JAXBContext context = JAXBContext.newInstance(inventario.class);
		Marshaller ms = context.createMarshaller();
		
		inventario inv = new inventario();
		ArrayList<item> Ingredientes = new ArrayList<>();
		
		item i = new item();
		xmlRead xml = new xmlRead();
		ArrayList<item> Lista = xml.Inventario();
		
		for (int z=0; z<Lista.size();z++){
			Ingredientes.add(Lista.get(z));
		}
		
		i.setType(type);
		i.setNombre(name);
		i.setCantidad(cant);
		Ingredientes.add(i);
		
		inv.setIngredientes(Ingredientes);
		
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(inv, new FileWriter("Ingredientes.xml"));
	}
	
}
