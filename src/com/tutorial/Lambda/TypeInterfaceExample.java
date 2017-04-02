/**
 * 
 */
package com.tutorial.Lambda;

/**
 * @author aberehamwodajie
 *
 * Dec 5, 2016
 */
public class TypeInterfaceExample {
	
	public static void main(String[] args) {
		
		stringLengthLambda myLenght = (String s) -> s.length();
		
		int lenght = myLenght.getLenght("Hello from addis Ababa");
		
		System.out.println(lenght);		
	}
	
	interface stringLengthLambda {
		int getLenght(String s);
	}

}
