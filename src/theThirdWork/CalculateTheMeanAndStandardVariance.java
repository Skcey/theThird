package theThirdWork;

import java.util.Scanner;

public class CalculateTheMeanAndStandardVariance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		/*int[] num = new int[10];
		for(int i=0;i<10;i++) {
			num[i] = input.nextInt();
		}*/
		double sum = 0;
		double s = 0;
		for(int i=0;i<10;i++) {
			double num = input.nextDouble();
			sum+=num;
			s += num *num;
			
		}
		
		double mean = sum/ 10;
		System.out.println("The mean is "+mean);
		
		double standardDeviation = Math.sqrt((s-sum*sum/10)/9);
		System.out.println("The standard deviation is " + String.format("%.5f",standardDeviation));
	}

}
