/**
 * Project Euler #1: Multiples of 3 and 5
 * @author: Muktevigk
 * @params: int (Range in which to find mul of 3 and 5).
 * @return: Multiples of 5 and 3.
 */


package com.example.general;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplesDemo {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int numberOfCases = Integer.parseInt(stdin.nextLine());
        BigInteger sum = new BigInteger("0");
        int caseTemp = 0;
        BigInteger temp = null;
        for(int a = 0; a < numberOfCases; a++){
            caseTemp = Integer.parseInt(stdin.nextLine()) - 1;
            BigInteger caseTemp2 = new BigInteger("" + caseTemp);
            sum = new BigInteger("0");
            temp = caseTemp2.divide(new BigInteger("3"));

            sum = sum.add(temp.multiply(temp.add(new BigInteger("1"))).divide(new BigInteger("2")).multiply(new BigInteger("3")));

            temp = caseTemp2.divide(new BigInteger("5"));

            sum = sum.add(temp.multiply(temp.add(new BigInteger("1"))).divide(new BigInteger("2")).multiply(new BigInteger("5")));

            temp = caseTemp2.divide(new BigInteger("15"));

            sum = sum.subtract(temp.multiply(temp.add(new BigInteger("1"))).divide(new BigInteger("2")).multiply(new BigInteger("15")));

            System.out.println(sum);
        }

    }

}
