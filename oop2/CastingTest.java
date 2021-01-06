package oop2;

public class CastingTest {
	
	public static void main(String args[]) {
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe1 = null;
		
		fe.water();
		c = fe; //Upcasting
		
		fe1 = (FireEngine) c;
		fe1.water();
		fe1.drive();
	}
	
}

class Car{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
}

class FireEngine extends Car {
	
	void water() { 
		System.out.println("water");
	}
	
}