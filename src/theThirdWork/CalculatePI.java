package theThirdWork;

public class CalculatePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=0;
		int flag=1,cnt=1;
		for(int i=1;i<=100000;i++) {
			PI += 4.0*flag/(2*i-1);
			flag *= -1;
			if(i%10000==0) {
				System.out.println("当i="+cnt+"0000时，PI="+PI);
				cnt++;
			}
		}
	}

}
