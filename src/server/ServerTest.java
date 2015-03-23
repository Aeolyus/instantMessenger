package server;

import javax.swing.JFrame;
public class ServerTest {
	public static void main(String[] args) {
		Server aeolyus = new Server();
		aeolyus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aeolyus.startRunning();
	}

}
 