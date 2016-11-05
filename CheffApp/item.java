package CheffApp;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Desgolse  de los atributos de los items del xml 
 * @author Gerardo
 *
 */
@XmlRootElement(name="item")
@XmlType(propOrder={"type", "nombre", "cantidad"})
public class item {
	private String type;
	private String Cantidad;
	private String Nombre;
	
	public item(){}

	@XmlAttribute(name="type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlElement(name="Nombre")
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@XmlElement(name="Cantidad")
	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	

}
