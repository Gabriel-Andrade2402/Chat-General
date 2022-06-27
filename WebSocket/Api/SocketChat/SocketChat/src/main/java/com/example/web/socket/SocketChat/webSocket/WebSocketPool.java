package com.example.web.socket.SocketChat.webSocket;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.web.socket.WebSocketSession;

public class WebSocketPool {
	public static Map<Long, Set<WebSocketSession>> websockets = new HashMap<>();
}
