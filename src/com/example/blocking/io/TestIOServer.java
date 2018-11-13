package com.example.blocking.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestIOServer {

    public static void main(String[] args) throws IOException {

        int portNumber = 4444;
        System.out.println("Waiting on port : " + portNumber + "...");
        boolean listening = true;
        //bind server socket to port

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            while (listening) {

                Socket clientSocket = serverSocket.accept();

                new Thread(() -> {

                    try {
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                        String request, response;
                        while ((request = in.readLine()) != null) {
                            response = processRequest(request);
                            out.println(response);
                            if ("Done".equals(request)) {
                                break;
                            }
                        }
                        clientSocket.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }).start();

            }
        }

    }


    private static String processRequest(String request) {
        System.out.println("Server receive message from > " + request);
        return request;
    }
}
