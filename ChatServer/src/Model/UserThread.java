package Model;

import Controller.Controller;

public class UserThread extends Thread{
	private Controller server = null;
	
	public UserThread(Controller server) {
		super();
		this.server = server;
	}
}
