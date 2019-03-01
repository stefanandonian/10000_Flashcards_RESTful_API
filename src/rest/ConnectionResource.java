package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Connection;

@Path("connection")
public class ConnectionResource extends Resource<Connection> {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllConnections() {
		return getAll("Connection");
	}

	@GET
	@Path("/{connections}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getConnection(final @PathParam("connections") String pstrWord) { 
		return get("Connection", pstrWord);
	}

}
