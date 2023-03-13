package theThirdWork;

import java.util.Scanner;

public class CompareLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		double monthlyInterestRate ;
		double yearlyInterestRate;
		double monthlyPayment;
		double totalPayment;
		System.out.printf("Interesr Rate\tMonthly Payment\tTotal Payment\n");
		
		for(yearlyInterestRate = 5;yearlyInterestRate<=8.1;yearlyInterestRate+=0.125) {
			yearlyInterestRate *= 0.01;
			monthlyInterestRate = yearlyInterestRate/12;
			monthlyPayment = loanAmount * monthlyInterestRate / (
					1 - 1/Math.pow(1+monthlyInterestRate, numberOfYears * 12.0));
			totalPayment = monthlyPayment * 12 * numberOfYears;
			yearlyInterestRate *=100;
			System.out.printf("%.3f%%\t\t%.2f\t\t%.2f\n",yearlyInterestRate,monthlyPayment,totalPayment);
		}
	}

}
