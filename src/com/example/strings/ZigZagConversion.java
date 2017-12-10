package com.example.strings;

public class ZigZagConversion {

	public String convert(String str, int row) {
		// TODO Auto-generated method stub
		if (row == 0) {
			return "";
		}
		if(row == 1) {
			return str;
		}
		
		int magic = row * 2 - 2;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<row;i++) {
			buildRow(sb, i, magic, str);
		}
		return sb.toString();
	}

	private void buildRow(StringBuilder sb, int start, int magic, String str) {
		// TODO Auto-generated method stub
		int idx = start;
		int dis1 = magic-start-start;
		int dis2 = start * 2;
		
		if(dis1 == 0 || dis2 == 0) {
			dis1 = magic;
			dis2 = magic;
		}
		int count =0;
		while(idx < str.length()) {
			sb.append(str.charAt(idx));
			if(count%2 == 0) {
				idx += dis1;
			}else {
				idx += dis2;
			}
			count++;
		}
	}

}
