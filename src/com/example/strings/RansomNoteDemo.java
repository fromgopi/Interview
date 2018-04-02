package com.example.strings;

public class RansomNoteDemo {

    public static void main(String[] args) {

        String magazine = "give me one grand today night give me ";
        String note = "Gopi";

        RansomNote ransomNote = new RansomNote();

        ransomNote.checkRansomNote(magazine, note);

    }

}
