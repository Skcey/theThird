package theThirdWork;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number:");
		int decimal = input.nextInt();
		
		if(decimal == 0) {
			System.out.println("The binary number is 0");
		}else {
			String binary = "";
			while(decimal != 0) {
				int binaryValue = decimal %2;
				
				char binaryDigit = (char)(binaryValue + '0');
				binary = binaryDigit + binary;
				decimal /= 2;
			}
			System.out.println("The binary number is " + binary);
		}
	}

}
