package com.example.blocking.io;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

    public static void main(String[] args) throws IOException {

        Runnable client = () -> {
            try {

                new TestClient().startClient();

            }catch (IOException | InterruptedException e){
                e.printStackTrace();
            }
        };

        new Thread(client, "Client-A").start();
        new Thread(client, "Client-B").start();

    }


    private void startClient() throws IOException, InterruptedException {
        String name = "localhost";
        int port = 4444;
        String threadName = Thread.currentThread().getName();

        String[] messages = new String[] { threadName + " > msg1", threadName + " > msg2", threadName + " > msg3", threadName +
                " > Done" };

        try {
            Socket echoSocket = new Socket(name, port);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

            for (String message : messages) {
                BufferedReader stdIn = new BufferedReader(new StringReader(message));
                String userInput;
                while ((userInput = stdIn.readLine()) != null) {
                    out.println(userInput); // write to server
                    System.out.println("echo: " + in.readLine()); // Wait for the server to
                    // echo back
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host " + name);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + name + ".." + e.toString());
            System.exit(1);
        }
    }

}
