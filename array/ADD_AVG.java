package array;

import java.util.*;

public class ADD_AVG {
	public static void main(String args[]) {
	int SUM = 0; // 총 합을 저장하기 위한 정수형 변수
	float AVG = 0f; // 평균을 구하기 위한 실수형 변수	
	
	int score[] = new int [4]; // 점수들을 저장하기 위한 배열 
	
	Scanner scanner = new Scanner(System.in); // 입력을 위해 객체생성
	
	for(int i = 0; i<4 ; i++ ) { // 0~3까지 총 4번 실행
		System.out.print((i+1) + "번째 점수를 입력해주세요 : ");
		score[i] = scanner.nextInt(); //정수를 입력받음
		System.out.println("입력하신 점수는 " + score[i] + "입니다.");
		SUM += score[i]; // SUM 변수에 입력받은 배열값 더하기
	}
		AVG = SUM /(float)score.length; // 총 점수엣서 배열의 길이만큼 나누기
		System.out.println("총 점수는 " + SUM + "점입니다.");
		System.out.println("평균은 " + AVG + "점입니다.");
	
	}
}
