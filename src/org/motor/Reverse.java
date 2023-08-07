package org.motor;

public class Reverse {

	public static void main(String[] args) {
String orginalString ="senthil";
String reverseString ="";

		
for (int i = orginalString.length()-1; i >=0; i--) {
	
	reverseString=reverseString+orginalString.charAt(i) ;
	
	
	}
System.out.println(reverseString);

		
	}

}
