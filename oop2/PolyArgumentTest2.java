package oop2;

public class PolyArgumentTest2 {

	public  static void main(String args[]) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());// == Tv1 t = new Tv1(); b.buy(t);
		b.buy(new Computer2());
		b.buy(new Audio2());
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�");
		System.out.println("���� ���� ���ʽ� ����Ʈ�� " + b.bonusPoint + "���Դϴ�.");
		b.summary();
	}
}


class Product2{ 
	int price;
	int bonusPoint;
	
	Product2(){}
	
	Product2(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); 
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(200);
	}
	
	public String toString() {return "TV";}
	
}

class Computer2 extends Product2 {
	Computer2() {super(100);}
	
public String toString() {return "Computer";}
	
}

class Audio2 extends Product2 {
	Audio2() {super(70);}
	
public String toString() {return "Audio";}
	
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int cnt = 0;
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("�������� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[cnt++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
		
	}
	
	void summary() {
		
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			//itemList += item[i] + ", ";
			itemList += (i==0) ? "" : ", " + item[i];
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
