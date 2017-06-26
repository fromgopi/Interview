package com.example.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class DataServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(6013);
			System.out.println(ss.getLocalPort());
			while(true){
				Socket client = ss.accept();
				PrintWriter po = new PrintWriter(client.getOutputStream(), true);
				po.println(new java.util.Date().toString());
				ss.close();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
