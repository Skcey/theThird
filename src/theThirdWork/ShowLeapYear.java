package theThirdWork;

public class ShowLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		System.out.println("从101年到2100年，有闰年：");
		for(int i=101;i<=2100;i++) {
			if((i%4==0&&i%100!=0)||(i%400==0)) {
				cnt++;
				if(cnt%10 != 0) {
					System.out.print(i+" ");
				}else {
					System.out.println(i);
				}
			}
		}
		if(cnt%10!=0) {
			System.out.println();
		}
		System.out.println("共计"+cnt+"个");
	}

}
