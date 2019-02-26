package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Word;

@Path("word")
public class WordResource {

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getAllWords() {
	        Word wm = new Word("Kimberly", 
	                1,
	                1,
	                true,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false);
	        GenericEntity<Word> wordWrapperList = new GenericEntity<>(wm) {};
	        return Response.ok(wordWrapperList).build();
	    }

	    @GET
	    @Path("/{word}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getWordInformationByWord(final @PathParam("word") String pstrWord) {
	        Word wm = new Word("Kimberly",
	                1,
	                1,
	                true,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false,
	                false);
	        GenericEntity<Word> wordWrapperList = new GenericEntity<>(wm) {};
	        return Response.ok(wordWrapperList).build();
	    }

}
