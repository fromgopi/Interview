package com.example.threads;

import java.io.*;

public class ThreadWriteDemo {

    public static void main(String[] args) throws IOException {

        BufferedWriter f = null;
        try {
            f = new BufferedWriter(new FileWriter("randThread.txt"));
            for (int i = 0; i <10 ; i++) {
                f.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( f != null){
                f.close();
            }
        }
    }

}
