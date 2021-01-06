package oop;

/**
 * @author wido1
 *
 */
public class CardTest {
	
	public static void main(String args[]) {
		
		
		//Card.width, Card,height는 static으로 선언된 전역변수이기 인스턴스 생성 전에 호출 가능
		System.out.println("Card.width = " +  Card.width); 
		System.out.println("Card.width = " +  Card.height); 
		
		/*
		 * 배열로 선언시
		Card[] C = new Card[2];		
		C[0].kind = "Heart";
		C[0].number = 7;
		*/
		
		Card c1 = new Card();
		c1.kind = "Heart"; // 인스턴스 값 변경
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		System.out.println("c1은" + c1.kind +", " + c1.number +"이며, 크기는 " + c1.width + "," + c1.height); 
		System.out.println("c2는" + c2.kind +", " + c2.number +"이며, 크기는 " + c2.width + "," + c2.height); 
		
		c1.width = 50; // 클래스 값 변경
		c2.height = 80;
		
		//클래스의 값을 변경하였으므로 참조하는 모든 솏성의 값이 변한다.
		System.out.println("c1은" + c1.kind +", " + c1.number +"이며, 크기는 " + c1.width + "," + c1.height); 
		System.out.println("c2는" + c2.kind +", " + c2.number +"이며, 크기는 " + c2.width + "," + c2.height); 
		
	}	
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250; 
}