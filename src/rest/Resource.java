package rest;

import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import hibernate.queries.Select;
import parsers.wikipedia.control.WikiParseEngine;

public class Resource<T> {

    public Response getAll(String pstrClass) {
    	List<T> results = Select.<T>selectAll(pstrClass);
        GenericEntity<List<T>> responseWrapper = new GenericEntity<>(results) {};
        return Response.ok(responseWrapper).build();
    }

    public Response get(String pstrClass, String pstrWord) { 
        if (!Select.isInDB(pstrWord)) {
			WikiParseEngine engine = new WikiParseEngine();
			engine.runOneWord(pstrWord, -1);
		} 
        List<T> results = Select.<T>select(pstrClass, pstrWord);
        GenericEntity<List<T>> responseWrapper = new GenericEntity<>(results) {};
        return Response.ok(responseWrapper).build();
    }

}
