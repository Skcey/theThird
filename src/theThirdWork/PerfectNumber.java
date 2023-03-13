package theThirdWork;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(i==sum) {
				System.out.println(sum+" is the perfect number");
			}
		}
	}
}
