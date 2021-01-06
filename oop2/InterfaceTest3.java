package oop2;

public class InterfaceTest3 {
	public static void main(String args[]) {
	A3 a3 = new A3();
	a3.methodA();
	}
}

interface I2 {
	public abstract void methodB();
}

class A3{
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

class B3 implements I2 {
	
	public void methodB() {
		System.out.println("methodB in B3 class");
	}
	
	public String toString() { return "class B3";}
}

class InstanceManager{
	public static I2 getInstance() {
		return new B3();
	}
}