package calendar_date;

import java.util.Calendar;
import java.util.Locale;

public class calendarEx1 {
	public static void main(String args[]) {
		
		//추상 클래스인 Calendar의 메소드 getInstance()를 이용해 default time set을 해준 Calendar 객체를 생성하여
		// today 참조변수에 저장해준다 
		Calendar today = Calendar.getInstance(); 
		
		//위치로 인스턴스 초기화
		//Calendar today_FRENCH = Calendar.getInstance(Locale.FRENCH);
		
		System.out.println("이해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0 = 1월) : " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE와 DAY_OF_MONTH 는 같다
		System.out.println("이 달의 몇 일  : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일  : " + today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이 해의 몇일  : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1 = 일요일 ): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전_오후 (0_1)   : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~24) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		
		System.out.println("TimeZone(-12~+12) : " + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
		
		
		
	}
}
