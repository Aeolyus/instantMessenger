package client;
import javax.swing.JFrame;

import java.util.*;

public class ClientTest {
	public static void main(String[] args){
		Client charlie;
		charlie = new Client("192.168.1.6");
		charlie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		charlie.startRunning();
	}

}
