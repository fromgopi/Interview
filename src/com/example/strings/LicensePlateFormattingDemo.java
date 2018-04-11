package com.example.strings;

public class LicensePlateFormattingDemo {

    public static void main(String[] args) {

        String licensePlate = "2-5g-3-J";
        int range = 2;
        LicensePlateFormatting lp = new LicensePlateFormatting();
        
        String res = lp.formatLP(licensePlate, range);
        System.out.println("res = " + res);
    }

}
