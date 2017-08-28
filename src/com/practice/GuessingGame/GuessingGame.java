package com.practice.GuessingGame;

import java.util.Scanner;

public class GuessingGame {
	private int secret;
	private int bestScore;

	public GuessingGame() {
		secret = 37;
		bestScore = 999;
	}

	 void play() {
		int n = 0;
		int guess;
		boolean good = false;

		do {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter an integer between 0 and 100 inclusive:");
			guess = reader.nextInt();

			if (guess >= 0 && guess <= 100) {
				n++;
				
				if (n>100) {
					good = true;
					System.out.println("You have crossed 100 attempts");
				} else if(guess<secret){
					System.out.println("Too small");
				} 
				else if(guess>secret){
					System.out.println("Too Large");	
				}
				else if(guess==secret){
					System.out.println("You guessed the secret number!!!");
					good = true;
					if (n >= bestScore) {
						System.out.println("You did not beat your best score");
					} else if (n < bestScore) {
						bestScore = n;
						System.out.println("New Best Score");
						System.exit(0);
					}
				}
			} else {
				System.out.println("Sorry, your value needs to be in [0,100]");
			}
		} while (!good);

	}

	
}
