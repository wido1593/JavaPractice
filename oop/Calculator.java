package oop;
import java.util.*;
public class Calculator {
	public static void main(String args[]) {
		
		int menu, a, b;
		Scanner scanner = new Scanner(System.in);
		Cal cal = new Cal();
		
		System.out.println("2�� 4Ģ������ ������ ����ϴ�");
		
		do {
			System.out.println("�޴��� ������ �ּ���");
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.������");
			System.out.println("4.���ϱ�");
			System.out.println("0.����");
			
			menu = scanner.nextInt();
			if(menu == 0) {
				System.out.println("�����մϴ�"); 			
				break;
			}
			
			if(!(menu<=4 && menu>1)) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
				continue;
			} 
			else {
				System.out.println("ù��° ���� �Է����ּ���");
				a = scanner.nextInt();
				System.out.println("�ι�°��° ���� �Է����ּ���");
				b = scanner.nextInt();
				switch(menu) {
					case 1: cal.add(a, b); break;
					case 2: cal.sub(a, b); break;
					case 3: cal.div(a, b); break;
					case 4: cal.mul(a, b); break;		
				}
			}
			
		}while(menu!=0);
		
	}
}




class Cal {
	int add(int a, int b) {
		int result = a+b;
		System.out.printf("�� ���� ���� %3d�Դϴ�.%n", result);
		return result;
	}
	
	int sub(int a, int b) {
		int result = a-b;
		System.out.printf("�� ���� ����� %3d�Դϴ�.%n", result);
		return result;
	}
		
	float div(int a, int b) {
		float result = a / (float)b;
		System.out.printf("�� ���� ������� %f�Դϴ�.%n", result);
		return result;
	}
	
	int mul(int a, int b) {
		int result = a*b;
		System.out.printf("�� ���� ���� %3d�Դϴ�.%n", result);
		return result;
	}
	
}
