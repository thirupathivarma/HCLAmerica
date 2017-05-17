package com.HCLAmerica.StateStreet;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String to reverse:");
		Scanner input = new Scanner(System.in);
		System.out.println(new ReverseString().reverseString(input.nextLine()));
	}

	private String reverseString(String string) {
		int length = string.length();
    	char[] chars = new char[string.length()];
    	int i;
    	
    	/*
    	 * parsed in reverse order and characters are copied to array
    	 */
    	for(i=length - 1 ;i >= 0; i--) {
    		chars[length -1 - i]=string.charAt(i);
    	}
		
		return new String(chars);
		
	}

}
