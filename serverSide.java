package clientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverSide {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Set up Server port
		ServerSocket setSocket = new ServerSocket(8080);
		System.out.println("Waiting for a client");
		// Accept the socket
		Socket acceptSocket = setSocket.accept();
		
		//Get input from client
		Scanner getInputClient = new Scanner(acceptSocket.getInputStream());
		int number = getInputClient.nextInt();
		//System.out.println("Client Number "+number);
		int temp = number + number;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter Your Number");
//		int number = in.nextInt();
		
		// give input to client
		
		PrintStream giveInputClient = new PrintStream(acceptSocket.getOutputStream());
		giveInputClient.println("Hi, Client!! Your Number is "+number +" But my one is " +temp);
//		giveInputClient.println(number);
		
		

	}

}
