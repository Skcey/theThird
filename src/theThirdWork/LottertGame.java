package theThirdWork;

import java.util.Scanner;

public class LottertGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate a lottery number
		int lottery1 = (int)(Math.random()*10);
		int lottery2 = (int)(Math.random()*10);
		while(lottery2==lottery1) {
			lottery2 = (int)(Math.random()*10);
		}
		int lottery = lottery1*10+lottery2;
		
		//prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(two digits): ");
		int guess = input.nextInt();
		
		int guessDigit1 = guess/10;
		int guessDigit2 = guess%10;
		
		System.out.println("The lottery number is "+lottery);
		
		//Check the guess
		if(guess == lottery) {
			System.out.println("Exact match: you win $10,000");
		}else if(guessDigit2 == lottery1&&
				 guessDigit1 == lottery2
				) {
			System.out.println("Match all digits: you win $3,000");
		}else if(guessDigit1 == lottery1||
				 guessDigit1 == lottery2||
				 guessDigit2 == lottery1||
				 guessDigit2 == lottery2) {
			System.out.println("Match one digit: you win $1,000");
		}else {
			System.out.println("Sorry,no match");
		}		
	}
}
