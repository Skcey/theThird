package theThirdWork;

import java.util.Scanner;

public class ShowTheInstallmentRepaymentSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		annualInterestRate *=0.01;
		double monthlyInterestRate = annualInterestRate/12;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (
				1 - 1/Math.pow(1+monthlyInterestRate, numberOfYears * 12.0));
		double totalPayment = monthlyPayment * 12;
		System.out.println("Monthly Payment: "+String.format("%.2f",monthlyPayment));
		System.out.println("Total Payment: "+String.format("%.2f",totalPayment));
		
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		double interest,principal,balance=loanAmount;
		for(int i = 1;i <= numberOfYears * 12;i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i+"\t\t"+String.format("%.2f", interest)+"\t\t"
			+String.format("%.2f",principal)+"\t\t"
			+String.format("%.2f",balance));
		}
		
	}

}
