package oop;

public class InitializeTest1 {

	static int count = 0; // ����� �ʱ�ȭ
	int serialNo;
	
	{
		count++;
		serialNo = count;
		
	}
	
	public InitializeTest1() {}
	
	public static void main(String args[]) {
	
		InitializeTest1 it1 = new InitializeTest1();
		InitializeTest1 it2 = new InitializeTest1();
		InitializeTest1 it3 = new InitializeTest1();
		
		System.out.println("it1�� ��ǰ��ȣ��" + it1.serialNo);
		System.out.println("it2�� ��ǰ��ȣ��" + it2.serialNo);
		System.out.println("it3�� ��ǰ��ȣ��" + it3.serialNo);
		System.out.println("��ǰ�� �� ������ " + InitializeTest1.count + "�Դϴ�.");
	}
}
