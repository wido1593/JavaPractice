package oop;

public class InitializeTest1 {

	static int count = 0; // 명시적 초기화
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
		
		System.out.println("it1의 제품번호는" + it1.serialNo);
		System.out.println("it2의 제품번호는" + it2.serialNo);
		System.out.println("it3의 제품번호는" + it3.serialNo);
		System.out.println("제품의 총 갯수는 " + InitializeTest1.count + "입니다.");
	}
}
