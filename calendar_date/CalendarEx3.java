package calendar_date;

import java.util.Calendar;

public class CalendarEx3 {
	public static void main(String args[]) {
		
		Calendar date = Calendar.getInstance();
		//date.set(2020, Calendar.MAY, 3); //Ŀ���� ����
		
		System.out.println(toString(date));
		System.out.println("= 1�� ��  = ");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6�� ��  = ");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 20�� ��= ");
		date.roll(Calendar.DATE, 20);// �ٸ��ʵ� ���� X 
		System.out.println(toString(date));
		
		System.out.println("= 31�� ��= ");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		
	}
	
	public static String toString(Calendar date)  {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��"  ;
		
	}
	
}
