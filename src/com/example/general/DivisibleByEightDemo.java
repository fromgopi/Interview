package com.example.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DivisibleByEightDemo {

    static boolean checkDivisibility(String N) {
        Map<Integer, Integer> digitToCountN = computeDigitToCount(N);
        for (int prefix = 0; prefix < 1000; prefix += 8) {
            if (allContains(computeDigitToCount(String.format("%0" + Math.min(3, N.length()) + "d", prefix)),
                    digitToCountN)) {
                return true;
            }
        }
        return false;
    }
    static private Map<Integer, Integer> computeDigitToCount(String number) {
        Map<Integer, Integer> digitToCount = new HashMap<>();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';

            digitToCount.put(digit, digitToCount.getOrDefault(digit, 0) + 1);
        }
        return digitToCount;
    }
    static boolean allContains(Map<Integer, Integer> digitToCountPrefix, Map<Integer, Integer> digitToCountN) {
        return digitToCountPrefix.keySet().stream().allMatch(
                prefixDigit -> digitToCountN.getOrDefault(prefixDigit, 0) >= digitToCountPrefix.get(prefixDigit));
    }

    public static void main(String[] args) {
        String fileName = "input008.txt";
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(checkDivisibility(line) ? "YES" : "NO");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

