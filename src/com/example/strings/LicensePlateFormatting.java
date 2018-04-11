package com.example.strings;

public class LicensePlateFormatting {

    public String formatLP(String licensePlate, int range){

        StringBuilder sb = new StringBuilder();
        int len = licensePlate.length();

        for (int i = licensePlate.length() - 1; i >= 0; i--){
            if (licensePlate.charAt(i) != '-') {
                System.out.println(sb.length() % (range + 1));
                sb.append(sb.length() % (range + 1) == range ? '-' : "").append(licensePlate.charAt(i));
            }

        }
        return sb.reverse().toString();
    }

}
