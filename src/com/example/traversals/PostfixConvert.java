package com.example.traversals;

import java.util.Stack;

public class PostfixConvert {
	Stack<Character> stack = new Stack<Character>();
	String  convert(String s){
		char ch;
		String post = "";
		for(int i=0;i<s.length();i++){
			ch = s.charAt(i);
			if(Character.isLetterOrDigit(ch)){
				post = post+ch;
			}
			else if(ch == '('){
				stack.push(ch);
			}
			else if(ch == ')'){
				while(stack.peek() != '('){
					post = post + stack.pop(); 
				}
				stack.pop();
			}
			else{
				while(stack.isEmpty() && stack.peek() != '(' && prec(ch) <= prec(stack.peek())){
					post = post + stack.pop();
				}
				stack.push(ch);
			}
		}
		while(stack.isEmpty()){
			post = post + stack.pop();
		}
		return post;
	}
	private int prec(char ch) {
		// TODO Auto-generated method stub
		if(ch == '+' || ch == '-')
			return 1;
		if(ch == '*' || ch == '/' || ch == '%')
			return 2;
		return 0;
	}
}
