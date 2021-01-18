package calendar_date;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;

public class calendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, Calendar.MAY, 3, 2, 0);
		
		System.out.println("date1�� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�" );
		
		System.out.println("������ " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�." );
		
		DecimalFormat formatter = new DecimalFormat("###,###");
		
		long diffrence = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("�׳����� ���ݱ��� " +formatter.format(diffrence)  + "�ʰ� �������ϴ�");
		System.out.println("�Ϸ� ����ϸ� " + diffrence/(24 * 60 * 60) + "���Դϴ�.");
	
	}
	
	public static String toString(Calendar date) {
		return 
				date.get(Calendar.YEAR) + "�� "
				+ (date.get(Calendar.MONTH)+1) + "�� "
				+ date.get(Calendar.DAY_OF_MONTH) + "�� ";
	}
}
