package array;

import java.util.Arrays;

public class Shuffle {
	public static void main(String args[]) {		
		
		int score[] = new int [10]; // 숫자들을 저장하기 위한 배열 
		
		for(int i = 0; i<score.length ; i++ ) { // score 변수의 길이만큼 반복
			score[i] = i ; // 0~9만큼 각자 인덱스에 저장	
		}
		System.out.println("배열에 저장된 값은 " + Arrays.toString(score));
		
		int tmp = 0; // 임시값을 보존하기위한 저장공간		
		for(int i = 0; i<score.length ; i++ ) { // score 변수의 길이만큼 반복
			int n = (int)(Math.random() * score.length) ; // 0~9 만큼 랜덤한 값을  각 배열에 저장		
			tmp = score[0];
			score[0] = score[n];
			score[n] = tmp;
		}	
		System.out.println("섞기후 배열에 저장된 값은 " + Arrays.toString(score));
}
}
