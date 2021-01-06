package oop2;

public class PolyArgumentTest {
	
	public  static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());// == Tv1 t = new Tv1(); b.buy(t);
		b.buy(new Computer1());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 남은 보너스 포인트는 " + b.bonusPoint + "점입니다.");
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
			System.out.println("소지금이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하셨습니다.");
		
	}
}
