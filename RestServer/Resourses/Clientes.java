package Resourses;

//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

//import javax.ws.rs.core.MediaType;

//import CheffApp.*;
//import tools.*;

@Path("/clientes")
public class Clientes {
	@GET
	@Path("/archivo")
	//@Produces(MediaType.APPLICATION_JSON)
	public String Hola(){
		return "Hola";
	}
	
}
