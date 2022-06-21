package Enumtest01;

import java.util.Calendar;

public class EnumWeekTest {

	public static void main(String[] args) {
		Week today = null;
		today = Week.Friday;
		System.out.println(today);
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1:
			today=Week.Sunday;
			break;			
		case 2:
			today=Week.Monday;
			break;
		case 3:
			today=Week.Tuesday;
			break;
		case 4:
			today=Week.Wednesday;
			break;
		case 5:
			today=Week.Thursday;
			break;
		case 6:
			today=Week.Friday;
			break;
		

	}
	System.out.println("오늘은"+today+"입니다.");

}
