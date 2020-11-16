
package com.autonomia.digital;

import java.io.IOException;

import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class GestionChat {
	@OnMessage
	public void mensaje(String message, Session client) throws IOException, EncodeException {
		for (Session openSession : client.getOpenSessions()) {
			openSession.getBasicRemote().sendText(message);
		}
	}
}
