/**
 * 
 */
package com.tutorial.Lambda;

/**
 * @author aberehamwodajie
 *
 *         Dec 5, 2016
 */
public class Greeter {

	public void great(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.println("Hello world");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world");
			}
		};

		greeter.great(lambdaGreeting);
		greeter.great(innerClassGreeting);

		stringLengthLambda myLenght = (String s) -> s.length();

		int lenght = myLenght.getLenght("Hello from addis Ababa");

		System.out.println(lenght);

	}

	interface stringLengthLambda {
		int getLenght(String s);
	}
}
