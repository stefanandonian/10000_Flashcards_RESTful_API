package rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hibernate.pojo.Word;
import hibernate.queries.SelectManager;

@Path("word")
public class WordResource {

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getAllWords() {
	    	List<Word> wordList = SelectManager.selectAllWords();
	        GenericEntity<List<Word>> wordWrapperList = new GenericEntity<>(wordList) {};
	        return Response.ok(wordWrapperList).build();
	    }

	    @GET
	    @Path("/{word}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getWordInformationByWord(final @PathParam("word") String pstrWord) {
	        List<Word> wordList = SelectManager.selectWord(pstrWord);
	        GenericEntity<List<Word>> wordWrapperList = new GenericEntity<>(wordList) {};
	        return Response.ok(wordWrapperList).build();
	    }

}
