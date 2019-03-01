package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.SpanishVerbConjugation;

@Path("verb")
public class SpanishVerbResource extends Resource<SpanishVerbConjugation> {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllDefinitions() {
        return getAll("SpanishVerbConjugation");
    }

    @GET
    @Path("/{verb}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDefinition(final @PathParam("verb") String pstrWord) { 
        return get("SpanishVerbConjugation", pstrWord);
    }
	
}
