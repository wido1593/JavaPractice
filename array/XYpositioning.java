package array;
import java.util.*;
public class XYpositioning {
	public static void main(String args[]) {
		
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard= { 
			//	1~9 (0~8)
				{0,0,1,0,1,0,0,0,0}, //2���� �迭�� �����Ͽ� 1����ġ�� �������ش�.
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
			board[0][i] =board[i][0] = (char)(i+'0'); //X,Y �� ��ǥ�� �����Ѵ�.
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("��ǥ�� �Է��ϼ��� (�����00) : ");
			String input = scanner.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0) - '0'; // ���ڷ� �νĹޱ� ���� -'0'
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0) break; //�Է¹������� 00�̸� ���α׷��� �����Ѵ�.
			}
			
			if(input.length()!=2||x<=0||x>=SIZE||y<=0||y>=SIZE) {//�Է±��̰� 2 ���Ѱų� 2���� ������
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
			}
			
			board[x][y] = shipBoard[x-1][y-1]== 1 ? 'O' : 'X'; //�ش��ϴ� ������ �迭�� ���� 1 �̶�� O�� ���� �ƴϸ� X�� ���� 
			
			for(int i =0 ; i<SIZE; i++) {
				System.out.println(board[i]);//1�྿ �� SIZE��ŭ
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
