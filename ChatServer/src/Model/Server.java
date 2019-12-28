package Model;

import java.net.ServerSocket;

public class Server extends Thread {
	private UserThread clients[] = new UserThread[50];
	private int clientCount = 0;
	private ServerSocket server = null;
	private Thread thread = null;
	
	public Server() {
		//binding
	}
	
	public void run() {
		//listening
	}
}
