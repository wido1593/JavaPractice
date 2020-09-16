package array;

import java.util.Arrays;

public class Min_Max {
	
	public static void main(String args[]) {
		
		int score[] = new int [6]; // �������� �����ϱ� ���� �迭 
				
		for(int i = 0; i<score.length ; i++ ) { // score ������ ���̸�ŭ �ݺ�
			score[i] = (int)(Math.random() * 99) + 1 ; // 1~100 ��ŭ ������ ����  �� �迭�� ����			
		}
		int max = score[0], min = score[0]; // �ִ밪 �ּҰ��� �����ϱ� ���� ������ ����, ù��° �ε��� ������ �ʱ�ȭ
		System.out.println("����� �迭�� ������ " + Arrays.toString(score) + "�Դϴ�");
		
		for(int i = 1; i<score.length ; i++ ) { // �ι�° �ε������� ��
			if(score[i]>max) { // i��° �ε����� max���� ũ�ٸ� �� ����
				max = score[i];
			} else if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪�� : " + max);
		System.out.println("�ּҰ��� : " + min);		
	}
}
