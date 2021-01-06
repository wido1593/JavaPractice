package oop;

/**
 * @author wido1
 *
 */
public class CardTest {
	
	public static void main(String args[]) {
		
		
		//Card.width, Card,height�� static���� ����� ���������̱� �ν��Ͻ� ���� ���� ȣ�� ����
		System.out.println("Card.width = " +  Card.width); 
		System.out.println("Card.width = " +  Card.height); 
		
		/*
		 * �迭�� �����
		Card[] C = new Card[2];		
		C[0].kind = "Heart";
		C[0].number = 7;
		*/
		
		Card c1 = new Card();
		c1.kind = "Heart"; // �ν��Ͻ� �� ����
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		System.out.println("c1��" + c1.kind +", " + c1.number +"�̸�, ũ��� " + c1.width + "," + c1.height); 
		System.out.println("c2��" + c2.kind +", " + c2.number +"�̸�, ũ��� " + c2.width + "," + c2.height); 
		
		c1.width = 50; // Ŭ���� �� ����
		c2.height = 80;
		
		//Ŭ������ ���� �����Ͽ����Ƿ� �����ϴ� ��� ������ ���� ���Ѵ�.
		System.out.println("c1��" + c1.kind +", " + c1.number +"�̸�, ũ��� " + c1.width + "," + c1.height); 
		System.out.println("c2��" + c2.kind +", " + c2.number +"�̸�, ũ��� " + c2.width + "," + c2.height); 
		
	}	
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250; 
}