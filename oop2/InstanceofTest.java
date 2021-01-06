package oop2;

public class InstanceofTest {
	
	public static void main(String args[]) {
	FireEngine1 fe = new FireEngine1();
	
	if(fe instanceof FireEngine1) { 
		System.out.println("FireEngine Instance");
	}
	
	if(fe instanceof Car1) {
		System.out.println("Car Instance");
	}
	
	if(fe instanceof Object) {
		System.out.println("Object Instance");
	}
	
}
	
}

class Car1{}
class FireEngine1 extends Car1 {}