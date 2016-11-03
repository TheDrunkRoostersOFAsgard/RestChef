package main;

import java.io.IOException;
import org.jdom2.JDOMException;
import tools.XMLRead;

public class Main {

	public static void main(String[] args) throws JDOMException, IOException {
		XMLRead xml = new XMLRead();
		xml.Leer("IngredienteF");
		xml.Frutas.listar();
		System.out.println("+++++++++++++++++++++++++++++++");
		xml.Leer("IngredienteV");
		xml.Verduras.listar();
	}

}
