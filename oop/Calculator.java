package oop;
import java.util.*;
public class Calculator {
	public static void main(String args[]) {
		
		int menu, a, b;
		Scanner scanner = new Scanner(System.in);
		Cal cal = new Cal();
		
		System.out.println("2항 4칙연산이 가능한 계산깁니다");
		
		do {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.나누기");
			System.out.println("4.곱하기");
			System.out.println("0.종료");
			
			menu = scanner.nextInt();
			if(menu == 0) {
				System.out.println("종료합니다"); 			
				break;
			}
			
			if(!(menu<=4 && menu>1)) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
				continue;
			} 
			else {
				System.out.println("첫번째 항을 입력해주세요");
				a = scanner.nextInt();
				System.out.println("두번째번째 항을 입력해주세요");
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
		System.out.printf("두 값의 합은 %3d입니다.%n", result);
		return result;
	}
	
	int sub(int a, int b) {
		int result = a-b;
		System.out.printf("두 값의 빼기는 %3d입니다.%n", result);
		return result;
	}
		
	float div(int a, int b) {
		float result = a / (float)b;
		System.out.printf("두 값의 나누기는 %f입니다.%n", result);
		return result;
	}
	
	int mul(int a, int b) {
		int result = a*b;
		System.out.printf("두 값의 곱은 %3d입니다.%n", result);
		return result;
	}
	
}
