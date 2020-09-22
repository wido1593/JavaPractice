package oop;

public class ObjectOrient {
	public static void main(String args[]) {
		//�ν��Ͻ� ����(�迭����)
		Tv[] tvArr = new Tv[3];
		
		//�ν��Ͻ��� ������ �϶�, �ݺ����� �̿��Ͽ� ������Ų��.
		for(int i = 0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i= 0 ;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d %n",i,tvArr[i].channel);
		}
	}
}

class Tv{ // ��ü�� �Ӽ�, ����(�޼ҵ�)�� ������ TvŬ����
	//�Ӽ� ����
	String color;
	boolean power;
	int channel;
	
	//���(�޼���)
	void power() { power= !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
