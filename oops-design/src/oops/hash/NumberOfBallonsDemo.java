package oops.hash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NumberOfBallonsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        
        // String text = "loonbalxballpoon";
        String text = "";
        File file = new File("/Users/vamsikrishnamuktevi/Documents/python/Interview/oops-design/src/inputs/hash/input.txt");

        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            text = sc.nextLine();
        }
        
        NumberOfBallons obj = new NumberOfBallons();
        // int res = obj.countMaxBallons(text);
        
        int res = obj.countBalloons(text);
        System.out.println(res);
    }
}
