<<<<<<< HEAD
package array;

import java.util.Arrays;

public class Sort {
	
	public static void main(String args[]){
		int sort[] = new int[5];
		
		for(int i = 0;i<sort.length;i++) {
			sort[i] = (int)(Math.random()*10 +1);
		}
		System.out.println(Arrays.toString(sort));
		
		int tmp = 0; // �ӽ� �����
		
		for(int i = 0;i<sort.length-1;i++) {//���ڸ��� ������ �ִ밪�� ���� �� X -1
			
			for(int j = 0; j<sort.length-1-i;j++) {	//�ڿ������� �ִ밪���� ä���� ������.
				
				if(sort[j]>sort[j+1]) {		// �������� ���� ä��������, J�� ���ʿ�������  Sort�� �����Ѵ�.			
					tmp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = tmp;
					System.out.println(Arrays.toString(sort));						
				}	
			}				
		}
		System.out.println(Arrays.toString(sort));
	}
}
=======
package array;

import java.util.Arrays;

public class Sort {
	
	public static void main(String args[]){
		int sort[] = new int[5];
		
		for(int i = 0;i<sort.length;i++) {
			sort[i] = (int)(Math.random()*10 +1);
		}
		System.out.println(Arrays.toString(sort));
		
		int tmp = 0; // �ӽ� �����
		
		for(int i = 0;i<sort.length-1;i++) {//���ڸ��� ������ �ִ밪�� ���� �� X -1
			
			for(int j = 0; j<sort.length-1-i;j++) {	//�ڿ������� �ִ밪���� ä���� ������.
				
				if(sort[j]>sort[j+1]) {		// �������� ���� ä��������, J�� ���ʿ�������  Sort�� �����Ѵ�.			
					tmp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = tmp;
					System.out.println(Arrays.toString(sort));						
				}	
			}				
		}
		System.out.println(Arrays.toString(sort));
	}
}
>>>>>>> 2a11510134ac7322b6d0fe0895d44861eeb5e05a
