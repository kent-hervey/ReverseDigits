package com.hervey.app;

public class appReverseDigits {
	
	
	public static void main(String[] args) {
		
		int originalNumber = 12345;
		
		int reversedNumber = NumberConversions.reverseDigits(originalNumber);
		
		System.out.println("Incoming number was:  " + originalNumber + " and reversed number is;  " + reversedNumber);
		
	}
	

}
