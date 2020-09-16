package array;

import java.util.Arrays;

public class Min_Max {
	
	public static void main(String args[]) {
		
		int score[] = new int [6]; // 점수들을 저장하기 위한 배열 
				
		for(int i = 0; i<score.length ; i++ ) { // score 변수의 길이만큼 반복
			score[i] = (int)(Math.random() * 99) + 1 ; // 1~100 만큼 랜덤한 값을  각 배열에 저장			
		}
		int max = score[0], min = score[0]; // 최대값 최소값을 저장하기 위한 정수형 변수, 첫번째 인덱스 값으로 초기화
		System.out.println("저장된 배열의 값들은 " + Arrays.toString(score) + "입니다");
		
		for(int i = 1; i<score.length ; i++ ) { // 두번째 인덱스에서 비교
			if(score[i]>max) { // i번째 인덱스가 max보다 크다면 값 변경
				max = score[i];
			} else if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);		
	}
}
