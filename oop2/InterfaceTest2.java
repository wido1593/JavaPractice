package oop2;

public class InterfaceTest2 {
	public static void main(String args[]) {
		A1 a1 = new A1();
		a1.autoPlay(new B1());
		a1.autoPlay(new C1());
	}
}

interface I {
	public abstract void play();
}

class A1{
	void autoPlay(I i) {
		i.play();
	}
}

class B1 implements I {
	public void play() {
		System.out.println("play in B1 class");
	}
}

class C1 implements I {
	public void play() {
		System.out.println("play in C1 clas");
	}
}