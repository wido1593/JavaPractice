package oop;
 
class Data {int x;} // 참조혈 클래스

public class Reference {
	
	public static void main(String[] args) {
			
		//Reference
		
		Data d= new Data(); // 인스턴스생성
		d.x=10;// 클래스의 변수 값 변경
		System.out.println("x=" + d.x); // 10
		change(d); // 클래스 호출
		System.out.printf("x=%d \n\n", d.x); // 클래스를 벗어나도 1000 유지
		
		//Reference by array
		int[] arr = new int[5];	// 빈 배열 생성
		randomArr(arr); // 값을 랜덤하게 배정
		sortArr(arr); // 오름차순 정렬
		changeArr(arr); // 인덱스 변경
		sortArr(arr);// 메인 메소드에서도 값 유지
		
	}
	// 클래스 변수 값 변경
	static void change(Data d) // 매개변수로 클래스를 받는다
	{
		d.x=1000;
		System.out.println("x=" + d.x); // 클래스 내부 1000
	}
	
	//랜덤값 생성
	static void randomArr(int[] arr) {		
		for(int i = 0; i <5 ; i++ ) {
			arr[i] = (int)(Math.random() * 8 + 1);
		}
		printArr(arr);
 	}
	
	//출력
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int a : arr )
			System.out.print(a+",");
		System.out.print("]\n\n");
	}
	
	// 오름차순 버블 소팅
	static void sortArr(int[] arr) {
		int tmp = 0;
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
				
			}
		}
		printArr(arr);
	}
	//배열 값 변경
	static void changeArr(int[] arr) {
		int tmp = arr[3];
		arr[3] = arr[4];
		arr[4]= tmp;
		printArr(arr);
	}
}

