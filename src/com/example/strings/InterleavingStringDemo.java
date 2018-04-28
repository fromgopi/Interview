package com.example.strings;

public class InterleavingStringDemo {

    //s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        
        InterleavingString is = new InterleavingString();

        System.out.println("is.interLeaving(s1,s2,s3) = " + is.interLeaving(s1,s2,s3));
    }

}
