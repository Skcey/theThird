package theThirdWork;

import java.util.Calendar;
import java.util.Scanner;

public class ShowCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Calendar c=Calendar.getInstance();
		
		String[] monthname={"January", "February", "March", "April", "May", "June", "July", 
				"August", "September", "October", "November", "December"};
		String[] Weekdayname= {"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		
		int year = input.nextInt();
		int theFirstDay = input.nextInt();
		
		//初始化日历
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH,0);
		c.set(Calendar.DATE, 1);
		c.set(Calendar.DAY_OF_WEEK, theFirstDay);
		
		for(int i=0;i<12;i++) {
			System.out.println("\t\t"+monthname[i]+" "+year);
			System.out.println("-----------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			
		    c.set(Calendar.MONTH, i);
		    c.set(Calendar.DATE, 1);//把日期设置为当月第一天  
		    c.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
		    int dayOfMonth= c.get(Calendar.DATE); 
		    
		    for(int j=1;j<=dayOfMonth;j++) {
		    	c.set(Calendar.DAY_OF_MONTH, j);
		    	int weekday = c.get(Calendar.DAY_OF_WEEK);
		    	if(j==1) {
		    		int d=weekday;
		    		d--;
		    		while(d!=0) {
		    			System.out.print("\t");
		    			d--;
		    		}
		    		System.out.print(j);
		    	}
		    	else {
		    		if(weekday==1)
		    		System.out.print(j);
		    		else
		    		System.out.print("\t"+j);
		    	}
		    	if(weekday==7) {
		    		System.out.println();
		    	}
		    }
			System.out.println();
		}
		
	}
}
