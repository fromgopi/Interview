package com.example.strings;

public class SegmentsInStringDemo {

    public static void main(String[] args) {
        String str = "Hello, My name is gopi asdnbjkasd  aksdjaskjdjkasd asdjkasdnasdlalsdlkasd a scnlkansdlkalksd.asdn,asldnla sd ";

        SegmentsInString res = new SegmentsInString();

        int result = res.findSegments(str);

        System.out.println("result = " + result);
    }

}
