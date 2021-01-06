package oop;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {};
	Car(String col,String GT , int d){
		color = col;
		gearType = GT;
		door = d;
	}
	
}

public class ArgsConstructor {
	public static void main(String args[]) {
		Car car = new Car();
		car.color = "black";
		car.gearType = "Auto";
		car.door = 4;
		
		Car car2 = new Car("White", "semi-auto", 2);
		
		System.out.println(car.color + car.gearType + car.door);
		System.out.println(car2.color + car2.gearType + car2.door);
	}
}
