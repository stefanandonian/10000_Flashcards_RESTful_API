package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Word;

@Path("word")
public class WordResource extends Resource<Word> {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllWords() {
		return getAll("Word");
	}

	@GET
	@Path("/{word}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWord(final @PathParam("word") String pstrWord) { 
		return get("Word", pstrWord);
	}  

}
