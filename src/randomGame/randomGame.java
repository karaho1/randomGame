package randomGame;
import java.util.Scanner;
import java.util.Random; 
public class randomGame {

	public static void main(String[] args) {
		//Objective: make a game that lets people guess a number until they get it right
		//using a while loop, I'll have the user input a number and be told if it's too high and too low
		//pseudocode
		
		//print a hello statement 
		//start a while loop
		//random number, assign it a name (realDom)
		//ask a user to give a number 1-25
		//if the user is too low, say too low
		//else if the user is too high, say too high
		//else if the user is right, you win
		//else, tell them the input is wrong 
		//you attempted x times (just use i++ or a counter and print i at the end of the game)
		
		System.out.println("Hello, welcome to the Random Number Game!");
		System.out.println("Today you will be participating in a game of higher or lower!");
		//welcome message for players
		Random ranDom = new Random();
		int realDom = ranDom.nextInt(51);
		//System.out.println(realDom);
		Scanner userInput = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.println("Input your guess (0-50) :");
			int numGuess = userInput.nextInt();
			if (numGuess > 50) {
				System.out.println("Invalid Entry. Guess again: ");
				//this ensures that they dont do an entry that won't count. doesn't add one to counter
			}
			else if (numGuess > realDom) {
				System.out.println("Lower");
				i++;
				//tells them to guess a lower number, adds one to the attempt count
			}
			else if (numGuess < realDom) {
				System.out.println("Higher");
				i++;
				//tells them to guess a higher number, adds one to the attempt count
			}
			else {
				System.out.println("Congat!");
				i++;
				break;
				//congrats is intentionally misspelled as part of my game design here
				//the break; command ends the loop and runs the finishing statements
			}
		
		
	} 
	System.out.println("Thank you for playing, you got it in " + i + " attempts.");
	userInput.close();
	//closing the scanner
}
}

//Program by: Kara Ho