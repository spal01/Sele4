package com.Date;

import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calendar.YEAR is "+Calendar.YEAR);
		System.out.println("Calendar.MONTH is "+Calendar.MONTH);
		System.out.println("Calendar.DAY_OF_WEEK is "+Calendar.DAY_OF_WEEK);
		System.out.println("Current Year is "+Calendar.DATE);
	Calendar cal=	Calendar.getInstance();
	
	System.out.println(cal.getTime());
	//if(cal.DAY_OF_WEEK==Calendar.SATURDAY || cal.DAY_OF_WEEK==Calendar.SUNDAY)
		//{cal.add(cal.DAY_OF_WEEK,+2);
		//System.out.println(cal.getTime());
		
		//}
		
		System.out.println("Year " + java.time.LocalDate.now().getYear());
		
		
	}

}
