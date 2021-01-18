package calendar_date;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class calendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, Calendar.MAY, 3, 2, 0);
		
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고" );
		
		System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다." );
		
		DecimalFormat formatter = new DecimalFormat("###,###");
		
		long diffrence = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그날부터 지금까지 " +formatter.format(diffrence)  + "초가 지났습니다");
		System.out.println("일로 계산하면 " + diffrence/(24 * 60 * 60) + "일입니다.");
	
	}
	
	public static String toString(Calendar date) {
		return 
				date.get(Calendar.YEAR) + "년 "
				+ (date.get(Calendar.MONTH)+1) + "월 "
				+ date.get(Calendar.DAY_OF_MONTH) + "일 ";
	}
}
