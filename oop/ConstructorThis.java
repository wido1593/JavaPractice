package oop;

class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1() {
		this("pink" , "fullMetal", 3 );
	}
	
	Car1(String color) {
		this(color, "semiAuto", 2);
	}
	
	Car1(String col, String GT, int d){
		this.color = col;
		this.gearType = GT;
		this.door = d;
	}
	
}

public class ConstructorThis {
	public static void main(String args[]) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("Siver");
		
		System.out.println(c1.color + c1.door + c1.gearType);
		System.out.println(c2.color + c2.door + c2.gearType);
	}
}
