package Resourses;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;








import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

import CheffApp.*;

/**
 * Restful Api
 * @author Gerardo
 *
 */
@Path("/clientes")
public class Clientes {
	xmlWrite insert = new xmlWrite();
	xmlRead read = new xmlRead();
	@GET
	@Path("/inventario")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<item> Menu() throws JAXBException{
		
		return read.Inventario();
	}
	@POST
	@Path("/addinvent")
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<item> Recibe(JSONObject input) throws JAXBException, IOException{
		String type = (String) input.get("type");
		String name = (String) input.get("nombre");
		String cant = (String) input.get("cantidad");
		
		insert.Inventario(type, name, cant);
		return read.Inventario();
	}
	@GET
	@Path("/menu")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<platillo> Inventario() throws JAXBException{
		return read.Menu();
	}
	

}
