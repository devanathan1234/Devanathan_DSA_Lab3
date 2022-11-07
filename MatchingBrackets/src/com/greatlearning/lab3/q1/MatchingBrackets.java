package com.greatlearning.lab3.q1;

import java.util.Scanner;
import java.util.Stack;
public class MatchingBrackets {
	
	public static boolean checkBrackets(String input) {
		Stack <Integer> stack = new Stack <> ();
		String openingBrackets = "([{<";
		String closingBrackets = ")]}>";
		String brackets = openingBrackets+ closingBrackets;
		
		for (char ch: input.toCharArray()) {
			if (!brackets.contains(ch+"")) {
				continue ;				
			}
			int index = -1;
			if ((index= openingBrackets.indexOf(ch))!=-1) {
				stack.push(index);
				continue ;
			}
			index = stack.pop();
			if (ch!=closingBrackets.charAt(index)) {
				return false;
				
			}
			
		}
		
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		try (Scanner scr = new Scanner (System.in);){
			System.out.println("Enter String with brackets for testing");
			String input = scr.next();
			boolean check=checkBrackets(input);
			if(check) {
				
				System.out.println("The entered string has balance brackets");
			
			}
			else {
				System.out.println("The entered string do not contain balance brackets");
			}
		}
	}

}
