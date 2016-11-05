package restChefServer;

import org.glassfish.jersey.server.ResourceConfig;
import Resourses.*;
/**
 * Registro de las clases en el servidor
 * @author Gerardo
 *
 */
public class Aplication extends ResourceConfig{
	public Aplication(){
		register(Clientes.class);
	}
}
