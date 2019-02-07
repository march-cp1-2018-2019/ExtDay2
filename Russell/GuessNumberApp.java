package chap11;

import java.util.Scanner;

public class GuessNumberApp {
	
	
	static void main(String[] args) {
		final int LIMIT = 10;
		
		System.out.println("guess the number");
		System.out.println("Im thnking og a number from 1 to 10" + LIMIT);
		System.out.println();
	
		
		double d = Math.random() * LIMIT;
		int number = (int) d;
 		number++;
 		System.out.println(number);
 		
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Guess a number: ");
 		int guess = sc.nextInt();
 		
 		if (guess < 1 || guess > LIMIT) {
 			System.out.println("invlaid");
 		}
 		if (guess < number) {
 			System.out.println("toolow");
 		}else if (guess > number) {
 			System.out.println("too high");
 		}else { 
 			System.out.println("that is it");
 		}
 		System.out.println("number was" + number );
	}	
	
}
