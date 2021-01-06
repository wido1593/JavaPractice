package oop;
 
class Data {int x;} // ������ Ŭ����

public class Reference {
	
	public static void main(String[] args) {
			
		//Reference
		
		Data d= new Data(); // �ν��Ͻ�����
		d.x=10;// Ŭ������ ���� �� ����
		System.out.println("x=" + d.x); // 10
		change(d); // Ŭ���� ȣ��
		System.out.printf("x=%d \n\n", d.x); // Ŭ������ ����� 1000 ����
		
		//Reference by array
		int[] arr = new int[5];	// �� �迭 ����
		randomArr(arr); // ���� �����ϰ� ����
		sortArr(arr); // �������� ����
		changeArr(arr); // �ε��� ����
		sortArr(arr);// ���� �޼ҵ忡���� �� ����
		
	}
	// Ŭ���� ���� �� ����
	static void change(Data d) // �Ű������� Ŭ������ �޴´�
	{
		d.x=1000;
		System.out.println("x=" + d.x); // Ŭ���� ���� 1000
	}
	
	//������ ����
	static void randomArr(int[] arr) {		
		for(int i = 0; i <5 ; i++ ) {
			arr[i] = (int)(Math.random() * 8 + 1);
		}
		printArr(arr);
 	}
	
	//���
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int a : arr )
			System.out.print(a+",");
		System.out.print("]\n\n");
	}
	
	// �������� ���� ����
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
	//�迭 �� ����
	static void changeArr(int[] arr) {
		int tmp = arr[3];
		arr[3] = arr[4];
		arr[4]= tmp;
		printArr(arr);
	}
}

