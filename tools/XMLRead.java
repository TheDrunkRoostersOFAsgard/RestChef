package tools;

import java.io.File;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
/**
 * Lector de archivos xml
 * @author Gerardo
 *
 */
public class XMLRead {
	public Lista Frutas = new Lista();
	public Lista Verduras = new Lista();
	public Lista Granos = new Lista();
	public Lista Carnes = new Lista();
	public Lista Lacteos = new Lista();
	public Lista Menu = new Lista();
	
	public void Leer(String File, String type){
		File xml = new File("C:\\Users\\Clemen\\workspace\\RestServer\\"+File+".xml");
		try{
			DocumentBuilder docu = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			org.w3c.dom.Document xmlD = docu.parse(xml);
			
			NodeList listIngre = xmlD.getElementsByTagName(type);
			for(int i=0; i<listIngre.getLength();i++){
				Element dato = (Element) listIngre.item(i);
				String listElement = dato.getFirstChild().getTextContent();
				if(type  == "IngredienteF"){
					Frutas.agregarAlFinal(listElement);}
				else if(type  == "IngredienteV"){
					Verduras.agregarAlFinal(listElement);
				}
				else if(type  == "IngredienteG"){
					Granos.agregarAlFinal(listElement);
				}
				else if(type  == "IngredienteL"){
					Lacteos.agregarAlFinal(listElement);
				}
				else if(type  == "IngredienteC"){
					Carnes.agregarAlFinal(listElement);
				}
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
