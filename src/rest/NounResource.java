package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Noun;

@Path("noun")
public class NounResource extends Resource<Noun> {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllNouns() {
        return getAll("Noun");
    }

    @GET
    @Path("/{noun}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNoun(final @PathParam("noun") String pstrWord) { 
        return get("Noun", pstrWord);
    }

}
