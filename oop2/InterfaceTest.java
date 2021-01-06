package oop2;

public class InterfaceTest {

	public static void main(String args[]) {
		
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}		
		if(f instanceof Fightable) {
			System.out.println("인터페이스를 구현하였습니다");
		}
		if(f instanceof Movable) {
			System.out.println("인터페이스를 구현하였습니다");
		}
		if(f instanceof Attackable) {
			System.out.println("인터페이스를 구현하였습니다");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}
		
		
	}
	
}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) { }
	public void attack(Unit u) {}
}


class Unit{
	int currentHP;
	int x,y;
}


interface Fightable extends Movable, Attackable{}
interface Movable { public abstract void move(int x, int y); }
interface Attackable { public abstract void attack(Unit u);}