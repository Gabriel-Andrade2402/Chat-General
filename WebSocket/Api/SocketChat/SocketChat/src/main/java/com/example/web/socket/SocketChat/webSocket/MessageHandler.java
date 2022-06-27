package com.example.web.socket.SocketChat.webSocket;

import java.io.IOException;

import org.springframework.web.socket.WebSocketSession;

public interface MessageHandler {
	public void addSessionToPool(Long userId, WebSocketSession session);
	public void sendMessageToUser(Long userId, String message) throws IOException;
	void removeFromSessionToPool(Long userId, WebSocketSession session);
}
