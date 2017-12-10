package com.example.strings;

public class ZigZagConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GOPIISAGOODBOYINTHEWORLDBECAUSEHEKNOWEVERYTHINGABOUTCOUMPUTERSCIENCE";
		ZigZagConversion z = new ZigZagConversion();
		long st = System.currentTimeMillis();
		String out = z.convert(str, 3);
		long et = System.currentTimeMillis();
		System.out.println(out + " " + (et-st)+"MS");
	}

}
