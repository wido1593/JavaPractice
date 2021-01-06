package oop2;

public class RepairableTest {
	
	public static void main(String args[]) {
		Tank2 tank = new Tank2();
		Dropship2 dropship = new Dropship2();
		
		//Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		scv.repair2(tank);
		
		scv.repair2(dropship);
		//scv.repair2(marine);
	}
	
}

interface Repairable{}

class Unit2{
	int hitPoint;
	final int MAX_HP1;
	Unit2(int hp){ MAX_HP1 = hp; }
}

class GroundUnit2 extends Unit2{ 
	GroundUnit2(int hp){
		super(hp);
	}
}

class AirUnit2 extends Unit2{
	AirUnit2(int hp) {
		super(hp);
	}
}

class Tank2 extends GroundUnit2 implements Repairable { 
	Tank2(){
		super(150);
		hitPoint = MAX_HP1;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship2 extends AirUnit2 implements Repairable {
	Dropship2() {
		super(125);
		hitPoint = MAX_HP1;		
	}
	
	public String toString() {
		return "Dropship"; 
	}
	
}

class Marine2 extends GroundUnit2{
	Marine2() {
		super(40);
		hitPoint = MAX_HP1;
	}
}

class SCV extends GroundUnit2 implements Repairable{
	SCV() { 
		super(60);
		hitPoint  = MAX_HP1;
	}
	
	void repair2(Repairable r) {
		if(r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint != u.MAX_HP1) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리가 끝났습니다.");
		}
		
	}
}