package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Definition;

@Path("definition")
public class DefinitionResource extends Resource<Definition> {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllDefinitions() {
        return getAll("Definition");
    }

    @GET
    @Path("/{definitions}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDefinition(final @PathParam("definitions") String pstrWord) { 
        return get("Definition", pstrWord);
    }
    
}
