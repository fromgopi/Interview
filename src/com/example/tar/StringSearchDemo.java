package com.example.tar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringSearchDemo {

    public static void main(String[] args) {
        // String search = "in";
        Scanner sc;
        StringSearch stringSearch = new StringSearch();
        try {
            sc = new Scanner(System.in);
            System.out.println("Please Enter the search key");
            String search = sc.next();
            System.out.println("Search key => " + search);

            System.out.print("Please choose Method \n 1) String Match 2) Regular Expression 3) Indexed\n");
            int method = sc.nextInt();
            System.out.println(method);

            if(method == 1){
                sc = new Scanner(new File("french_armed_forces.txt"));
                int searchCountFile1 = stringSearch.searchString(search, sc);
                sc = new Scanner(new File("warp_drive.txt"));
                int searchCountFile3 = stringSearch.searchString(search, sc);
                System.out.println("French_armed_forces.txt - " + searchCountFile1 + " matches");
                System.out.println("wrap+drive.txt - " + searchCountFile3 + " matches");

            }
            if(method == 2){
                sc = new Scanner(new File("french_armed_forces.txt"));
                int searchCount = stringSearch.searchString(search, sc);
                System.out.println("French_armed_forces.txt - " + searchCount + " matches");
                stringSearch.searchStringUsingRegex(search, sc);
            }
            if(method == 3){
                sc = new Scanner(new File("french_armed_forces.txt"));
                int searchCount = stringSearch.searchString(search, sc);
                System.out.println("French_armed_forces.txt - " + searchCount + " matches");
            }


            sc = new Scanner(new File("output.txt"));
            //int wordCount = stringSearch.searchString(search, scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
