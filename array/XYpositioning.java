package array;
import java.util.*;
public class XYpositioning {
	public static void main(String args[]) {
		
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard= { 
			//	1~9 (0~8)
				{0,0,1,0,1,0,0,0,0}, //2차원 배열을 생성하여 1의위치를 지정해준다.
				{0,0,0,1,0,0,0,1,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,1,0,0,0,1,0,0},
				{0,1,1,0,1,0,0,0,0},
				{1,0,0,0,0,0,0,0,1},
				{0,0,0,0,1,0,0,0,0},
				{1,0,0,1,0,0,0,1,0},
				{0,0,1,0,0,0,1,1,0}				
		};
		for(int i = 1 ; i<SIZE; i++) {
			board[0][i] =board[i][0] = (char)(i+'0'); //X,Y 의 좌표를 설정한다.
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요 (종료는00) : ");
			String input = scanner.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0) - '0'; // 숫자로 인식받기 위한 -'0'
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) break; //입력받은값이 00이면 프로그램을 종료한다.
			}
			
			if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {//입력길이가 2 를넘거나 2보다 작으면
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
			}
			
			board[x][y] = shipBoard[x-1][y-1]== 1 ? 'O' : 'X'; //해당하는 다차원 배열의 값이 1 이라면 O을 저장 아니면 X를 저장 
			
			for(int i =0 ; i<SIZE; i++) {
				System.out.println(board[i]);//1행씩 총 SIZE만큼
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
