package controller;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


//TODO
//TODO explicitly annotate serverEndpoint as an 
public class ServerEndPoint {
	private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());

	/**
	 * Method that sends a message to all the Sessions in the clients set. 
	 * @param msg The message to be sent.
	 */
	public void triggerAlert(String msg) {
		
		System.out.println("Received: " + msg); //DEBUG		
		//TODO
		
		
		
	}

	@OnOpen
	public void open(Session client) {
		System.out.println("On open: " + client.getId()); //DEBUG
		//TODO
		
		
	}

	@OnClose
	public void close(Session client) {
		//TODO
		
		
	}
}

