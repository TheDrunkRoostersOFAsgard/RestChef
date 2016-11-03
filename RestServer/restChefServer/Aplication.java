package restChefServer;

import org.glassfish.jersey.server.ResourceConfig;
import Resourses.*;

public class Aplication extends ResourceConfig{
	public Aplication(){
		register(Clientes.class);
		register(Cheffs.class);
	}
}
