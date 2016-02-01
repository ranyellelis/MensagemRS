package br.com.message;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MessageApplication  extends Application {
	 
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
 
	public MessageApplication() {
		singletons.add(new MessageRestService());
	}
 
	public Set<Class<?>> getClasses() {
		return empty;
	}
 
	public Set<Object> getSingletons() {
		return singletons;
	}
}