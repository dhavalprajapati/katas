package com.dhaval.katas.kata;


public class Palindrom {

	public Boolean isPalindrom(String palindromString) {
		if(palindromString.trim().length() == 0)
			return false;
		
		if(reverString(palindromString).equalsIgnoreCase(palindromString)){
			return true;
		}
		return false;
	}
	
	private String reverString(String palindromString) {
		String reverseString = ""; 
		for (int i = palindromString.length() -1 ; i ==0 ; i--) {
			reverseString += palindromString.charAt(i);
		}
		return reverseString;
	}
}
