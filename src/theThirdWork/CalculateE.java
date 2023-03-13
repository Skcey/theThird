package theThirdWork;

public class CalculateE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e=1,item=1;
		int cnt=1;
		for(int i=2;i<=100000;i++) {
			item /=(i-1);
			e += item;
			if(i%10000==0) {
				System.out.println("当i="+cnt+"0000时，e="+e);
				cnt++;
			}
		}
	}
}

