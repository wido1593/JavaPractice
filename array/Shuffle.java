package array;

import java.util.Arrays;

public class Shuffle {
	public static void main(String args[]) {		
		
		int score[] = new int [10]; // ���ڵ��� �����ϱ� ���� �迭 
		
		for(int i = 0; i<score.length ; i++ ) { // score ������ ���̸�ŭ �ݺ�
			score[i] = i ; // 0~9��ŭ ���� �ε����� ����	
		}
		System.out.println("�迭�� ����� ���� " + Arrays.toString(score));
		
		int tmp = 0; // �ӽð��� �����ϱ����� �������		
		for(int i = 0; i<score.length ; i++ ) { // score ������ ���̸�ŭ �ݺ�
			int n = (int)(Math.random() * score.length) ; // 0~9 ��ŭ ������ ����  �� �迭�� ����		
			tmp = score[0];
			score[0] = score[n];
			score[n] = tmp;
		}	
		System.out.println("������ �迭�� ����� ���� " + Arrays.toString(score));
}
}
