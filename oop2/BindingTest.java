package oop2;

public class BindingTest {
	public static void main(String arge[]) {
		
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		
		
	}
}

class Parent1 {
	int x = 100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
