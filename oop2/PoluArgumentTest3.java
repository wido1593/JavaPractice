package oop2;

import java.util.*;


public class PoluArgumentTest3 {

	public  static void main(String args[]) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();
		
		b.buy(tv);// == Tv1 t = new Tv1(); b.buy(t);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 남은 보너스 포인트는 " + b.bonusPoint + "점입니다.");
		System.out.println();
		b.refund(com);
		b.summary();
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 남은 보너스 포인트는 " + b.bonusPoint + "점입니다.");
	}
}


class Product3{ 
	int price;
	int bonusPoint;
	
	Product3(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); 
	}
	
	Product3(){
		price = 0;
		bonusPoint = 0;
	}
	
}

class Tv3 extends Product3 {
	Tv3() {
		super(200);
	}
	
	public String toString() {return "TV";}
	
}

class Computer3 extends Product3 {
	Computer3() {super(100);}
	
public String toString() {return "Computer";}
	
}

class Audio3 extends Product3 {
	Audio3() {super(70);}
	
public String toString() {return "Audio";}
	
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product3> item = new Vector<Product3>();
	
	void buy(Product3 p) {
		if(money<p.price) {
			System.out.println("소지금이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구매하셨습니다.");
		
	}
	
	void summary() {
		
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i<item.size(); i++) {
			Product3 p = (Product3) item.get(i);
			sum += p.price;
			//itemList += item[i] + ", ";
			itemList += (i==0) ? "" + p: ", " + p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
	
	void refund(Product3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 환불하셨습니다.");
		} else { 
			System.out.println("구매하신 상품이 없습니다.");
		}
	}
	
}
