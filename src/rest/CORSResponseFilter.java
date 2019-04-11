package rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

public class CORSResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, 
			           ContainerResponseContext responseContext) throws IOException {
		
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();

        headers.add("ACCESS_CONTROL_ALLOW_ORIGIN", "*");
        headers.add("ACCESS_CONTROL_ALLOW_HEADERS", "origin, content-type, accept, authorization");
        headers.add("ACCESS_CONTROL_ALLOW_CREDENTIALS", "true");
        headers.add("ACCESS_CONTROL_ALLOW_METHODS", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        headers.add("ACCESS_CONTROL_MAX_AGE", 12 * 60 * 60);
	}
	
}
