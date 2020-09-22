package array;
import java.util.*;

public class Bingo {
	
	public static void main(String args[]) {
		final int SIZE = 5;
		int x=0, y=0,num=0;
		
		int[][] bingo = new int[SIZE][SIZE];//SIZE * SIZE의 2차원 빈배열생성
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j] = i * SIZE + j +1; // 1~ SIZE*SIZE만큼 초기화
			}
		}

		for(int i = 0;i<SIZE;i++) { //순서를 랜덤하게 배열
			for(int j=0;j<SIZE;j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;				
				
			}
		}
		
		do {
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0 ; j <SIZE ; j++) {
					System.out.printf(" %2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1 ~ %d 의 숫자를 입력하세요 : ", (SIZE*SIZE));
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
				for(int i = 0;i<SIZE;i++) {
					for(int j = 0;j<SIZE;j++) {
						if(bingo[i][j]==num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
						
				}			
		} while(num!=0);
	}
}
