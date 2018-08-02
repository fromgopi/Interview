/**
 * Simple class that writes 100 random numbers to file.
 */
package com.example.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Randomness {

    private Random rand;
    private PrintWriter pw;

    public void writeRandomnessToFile(int number){
        int num, countOne=0, countTwo=0;
        try {
            pw = new PrintWriter(new File("random.txt"));
            rand = new Random();
            while (countOne < number){
                while (countTwo < 10){
                    num = rand.nextInt(number);
                    pw.print(num+",");
                    countOne++;
                    countTwo++;
                }
                countTwo = 0;
                pw.println();
            }
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
