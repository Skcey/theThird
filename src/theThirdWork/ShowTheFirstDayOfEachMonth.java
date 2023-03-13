package theThirdWork;

import java.util.Calendar;
import java.util.Scanner;

public class ShowTheFirstDayOfEachMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Calendar c=Calendar.getInstance();
		
		int year = input.nextInt();
		int theFirstDay = input.nextInt();
		
		//初始化日历
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH,0);
		c.set(Calendar.DATE, 1);
		c.set(Calendar.DAY_OF_WEEK, theFirstDay);
		
		String[] monthname={"January", "February", "March", "April", "May", "June", "July", 
				"August", "September", "October", "November", "December"};
		String[] weekname = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(int i=0;i<12;i++) {
			c.set(Calendar.MONTH, i);  //设置月份
			//月份设置完毕后获取月份和日期
			//int month = c.get(Calendar.MONTH);
			int week=c.get(Calendar.DAY_OF_WEEK);
			System.out.println(monthname[i]+" 1 , "+year+" is "+weekname[week]);
		}
	}

}
