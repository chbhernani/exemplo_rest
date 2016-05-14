package com.restful.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//o @path define a URI do recurso que nesse caso será /helloworld
@Path("/helloworld")
public class HelloWordResource {

	@GET // utilizando apenas o verbo GET, ou seja, vou apenas ler o recurso
	@Produces("text/plain") // define qual tipo MIME é retornado para o cliente
	public String show() {
		return "Hello World!";
	}
}