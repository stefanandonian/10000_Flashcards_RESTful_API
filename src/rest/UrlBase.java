package rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("spanish")
public class UrlBase extends ResourceConfig {
	
	public UrlBase() {
		register(WordResource.class);
		register(ConnectionResource.class);
		register(DefinitionResource.class);
		register(SpanishVerbResource.class);
		register(NounResource.class);
		register(CORSResponseFilter.class);
	}
	
}
