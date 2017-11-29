package clientServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Scanner scanInput = new Scanner(System.in);
		// Creat a socket for client for communication with server
		Socket socketCreat = new Socket("127.0.0.1", 8080);
		// get input from server
		Scanner getInputServer = new Scanner(socketCreat.getInputStream());
		System.out.println("Enter Your Number");
		
		int number = scanInput.nextInt();
		//give input to server
		PrintStream giveOutputServer = new PrintStream(socketCreat.getOutputStream());
		//
		giveOutputServer.println(number);
		//get reply from server
		
		String temp = getInputServer.nextLine();
		System.out.println(temp);
		
		

	}

	

}
