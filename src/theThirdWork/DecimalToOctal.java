package theThirdWork;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number:");
		int decimal = input.nextInt();
		
		if(decimal == 0) {
			System.out.println("The octal number is 0");
		}else {
			String octal = "";
			while(decimal != 0) {
				int octalValue = decimal %8;
				
				char octalDigit = (char)(octalValue + '0');
				octal = octalDigit + octal;
				decimal /= 8;
			}
			System.out.println("The binary number is " + octal);
		}
	}

}
