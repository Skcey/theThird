package theThirdWork;

import java.util.Scanner;

public class ISBNDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String str = input.next();
		
		int sum = 0;
		for(int i=0;i<9;i++) {
			sum += (str.charAt(i)-'0')*(i+1);
		}
		int d10 = sum%11;
		if(d10!=10) {
			System.out.println("The ISBN-10 number is "+str+d10);
		}else {
			System.out.println("The ISBN-10 number is "+str+"X");
		}
	}

}
