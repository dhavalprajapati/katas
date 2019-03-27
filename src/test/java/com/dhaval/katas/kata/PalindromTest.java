package com.dhaval.katas.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromTest{

	private Palindrom palindrom;
	
	 @Before
	 public void setup(){
		 palindrom = new Palindrom();
	 }

	 @Test
	 public void isPlaindromWithEmptyString() {
		 assertTrue(!palindrom.isPalindrom(" "));
	 }

	 @Test
	 public void isPlaindromWithBOB() {
		 assertTrue(!palindrom.isPalindrom("BOB"));
		 assertTrue(!palindrom.isPalindrom("BOB    "));
		 assertTrue(!palindrom.isPalindrom("  ABcdDCBA    "));
	 }
	 
	 @Test
	 public void isPlaindromWithGarbage() {
		 assertTrue(!palindrom.isPalindrom("Test"));
	 }
}
