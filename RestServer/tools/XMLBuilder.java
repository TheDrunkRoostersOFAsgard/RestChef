package tools;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class XMLBuilder {
		public void Fruta_Crear(String Tipo,String Nombre) {
	
	      try {
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.newDocument();
	         // root element
	         Element Type = doc.createElement(Tipo);
	         doc.appendChild(Type);
	
	         // Ingredient element
	         Element Ingredient = doc.createElement("Ingrediente");
	         Ingredient.appendChild(doc.createTextNode("Banano"));
	         Type.appendChild(Ingredient);
	         
	
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File(Nombre+".xml"));
	         transformer.transform(source, result);
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      } 
	   }  
  
}