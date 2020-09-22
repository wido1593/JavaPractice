package oop;

public class ObjectOrient {
	public static void main(String args[]) {
		//인스턴스 참조(배열형태)
		Tv[] tvArr = new Tv[3];
		
		//인스턴스가 여러개 일때, 반복문을 이용하여 참조시킨다.
		for(int i = 0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i= 0 ;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d %n",i,tvArr[i].channel);
		}
	}
}

class Tv{ // 객체의 속성, 동작(메소드)를 지정한 Tv클래스
	//속성 설정
	String color;
	boolean power;
	int channel;
	
	//기능(메서드)
	void power() { power= !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
