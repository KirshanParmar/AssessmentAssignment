package com.string.builder;

import java.util.Scanner;

public class StringBuilderPalindrome {

	public static String palindrome(String anyString) {

		StringBuilder sb = new StringBuilder();
		for (int i = anyString.length()-1; i>=0; i--) {
		        sb.append(anyString.charAt(i));
		}
		String string = sb.toString();
		if(string.equals(anyString)){
		   System.out.println("StringBuilder is Palindrome::"+ string);
		}else{
			System.out.println("StringBuilder is Not Palindrome::"+ string);
		}

		return string;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String: ");

		String input_string = scanner.nextLine();
		palindrome(input_string);

	}

}
