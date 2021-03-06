package oop2;

public class PolyArgumentTest2 {

	public  static void main(String args[]) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());// == Tv1 t = new Tv1(); b.buy(t);
		b.buy(new Computer2());
		b.buy(new Audio2());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 남은 보너스 포인트는 " + b.bonusPoint + "점입니다.");
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
			System.out.println("소지금이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[cnt++] = p;
		System.out.println(p + "을/를 구매하셨습니다.");
		
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
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
