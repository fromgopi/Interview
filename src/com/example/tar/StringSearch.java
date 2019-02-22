package com.example.tar;


import java.io.*;
import java.util.Scanner;

public class StringSearch {

    int searchString(String searchKey, Scanner scanner){
        int repetitions = 0;
        while (scanner.hasNext()){
            String line = scanner.next();

            if(line.equalsIgnoreCase(searchKey.toLowerCase())){
                repetitions++;
            }
        }
        return repetitions;
    }

    void searchString(String searchKey, String fileName){
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("output.txt");
            String line;

            while ((line = br.readLine()) != null){
                line = line.trim();
                if(!line.equals("")){
                    fileWriter.write(line, 0, line.length());
                }
            }
            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void searchStringUsingRegex(String searchKey){
        String statement = "Hello this method uses ";
        System.out.println(statement.matches("^this"));
    }
}
