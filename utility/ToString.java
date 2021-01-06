package utility;

import java.util.*;

public class ToString {
	public static void main(String args[]) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 3);
		
		String str = new String("KOREA");
		Date today = new Date();
		//java.util.Data today = new java.util.Data();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//String�� Date�� OverRidding�� �޼ҵ尡 �־� toString�� ���信 �°� ���
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
}

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() { // Object Ŭ���� OverRiding
		return "kind : " + kind + ", number : "+number;
	}
}