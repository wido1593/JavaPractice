package array;

import java.util.*;

public class ADD_AVG {
	public static void main(String args[]) {
	int SUM = 0; // �� ���� �����ϱ� ���� ������ ����
	float AVG = 0f; // ����� ���ϱ� ���� �Ǽ��� ����	
	
	int score[] = new int [4]; // �������� �����ϱ� ���� �迭 
	
	Scanner scanner = new Scanner(System.in); // �Է��� ���� ��ü����
	
	for(int i = 0; i<4 ; i++ ) { // 0~3���� �� 4�� ����
		System.out.print((i+1) + "��° ������ �Է����ּ��� : ");
		score[i] = scanner.nextInt(); //������ �Է¹���
		System.out.println("�Է��Ͻ� ������ " + score[i] + "�Դϴ�.");
		SUM += score[i]; // SUM ������ �Է¹��� �迭�� ���ϱ�
	}
		AVG = SUM /(float)score.length; // �� �������� �迭�� ���̸�ŭ ������
		System.out.println("�� ������ " + SUM + "���Դϴ�.");
		System.out.println("����� " + AVG + "���Դϴ�.");
	
	}
}
