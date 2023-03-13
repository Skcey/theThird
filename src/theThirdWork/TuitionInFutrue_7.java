package theThirdWork;

public class TuitionInFutrue_7 {
	public static void main(String[] args) {
		double currentTuition = 10000;
		double growthRate = 0.05;
		double tuitionInTenYears;
		tuitionInTenYears = currentTuition * (Math.pow(1+growthRate,10));
		System.out.printf("Tuition will be %.2f in the 10 years\n",tuitionInTenYears);
		int cnt=4;
		double sumOfTuition = 0,tuition = tuitionInTenYears;
		while(cnt>0) {
			sumOfTuition += tuition;
			tuition = tuition * (1+growthRate);
			cnt--;
		}
		System.out.printf("The sum tuition will be: %.2f\n",sumOfTuition);
	}
}
