package calendar_date;

import java.util.Calendar;
import java.util.Scanner;

public class calendarEx4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("��� ���� �Է��ϼ���. (/�� �������ּ���) : ");
		
		String in = sc.nextLine();		
		sc.close();
		String date[] = (in.split("/"));
		
		if(date.length != 2) {
			System.out.println("2���̻� ����");
			return;
		}
		
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int START_DAY_OF_WEEK, END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.printf("\t %d �� %d�� %n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i = 1; i < START_DAY_OF_WEEK ; i++) {
			System.out.print("   ");
		}
		
		for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY;i++, n++ ) {
			System.out.print((i<10) ? "  " +i : " " +i);
			if(n%7==0) System.out.println();
		}
		
	}

}
