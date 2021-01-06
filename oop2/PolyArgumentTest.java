package oop2;

public class PolyArgumentTest {
	
	public  static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());// == Tv1 t = new Tv1(); b.buy(t);
		b.buy(new Computer1());
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�");
		System.out.println("���� ���� ���ʽ� ����Ʈ�� " + b.bonusPoint + "���Դϴ�.");
	}
}

class Product{ 
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); 
	}
}

class Tv1 extends Product {
	Tv1() {
		super(200);
	}
	
	public String toString() {return "TV";}
	
}

class Computer1 extends Product {
	Computer1() {super(100);}
	
public String toString() {return "Computer";}
	
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	Buyer(){}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�������� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
		
	}
}
