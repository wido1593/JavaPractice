package oop2;

public class InterfaceTest {

	public static void main(String args[]) {
		
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}		
		if(f instanceof Fightable) {
			System.out.println("�������̽��� �����Ͽ����ϴ�");
		}
		if(f instanceof Movable) {
			System.out.println("�������̽��� �����Ͽ����ϴ�");
		}
		if(f instanceof Attackable) {
			System.out.println("�������̽��� �����Ͽ����ϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
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