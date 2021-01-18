package calendar_date;

import java.util.Calendar;
import java.util.Locale;

public class calendarEx1 {
	public static void main(String args[]) {
		
		//�߻� Ŭ������ Calendar�� �޼ҵ� getInstance()�� �̿��� default time set�� ���� Calendar ��ü�� �����Ͽ�
		// today ���������� �������ش� 
		Calendar today = Calendar.getInstance(); 
		
		//��ġ�� �ν��Ͻ� �ʱ�ȭ
		//Calendar today_FRENCH = Calendar.getInstance(Locale.FRENCH);
		
		System.out.println("������ �⵵ : " + today.get(Calendar.YEAR));
		System.out.println("��(0~11, 0 = 1��) : " + today.get(Calendar.MONTH));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE�� DAY_OF_MONTH �� ����
		System.out.println("�� ���� �� ��  : " + today.get(Calendar.DATE));
		System.out.println("�� ���� �� ��  : " + today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�� ���� ����  : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7, 1 = �Ͽ��� ): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("����_���� (0_1)   : " + today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð�(0~24) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + today.get(Calendar.MINUTE));
		System.out.println("�� : " + today.get(Calendar.SECOND));
		System.out.println("1000���� 1��(0~999) : " + today.get(Calendar.MILLISECOND));
		
		System.out.println("TimeZone(-12~+12) : " + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
		System.out.println("�� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE));
		
		
		
	}
}
