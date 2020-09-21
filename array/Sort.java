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
		
		int tmp = 0; // 임시 저장소
		
		for(int i = 0;i<sort.length-1;i++) {//끝자리는 어차피 최대값이 들어가니 비교 X -1
			
			for(int j = 0; j<sort.length-1-i;j++) {	//뒤에서부터 최대값들이 채워져 나간다.
				
				if(sort[j]>sort[j+1]) {		// 오른쪽은 값이 채워나가고, J는 왼쪽에서부터  Sort를 수행한다.			
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
		
		int tmp = 0; // 임시 저장소
		
		for(int i = 0;i<sort.length-1;i++) {//끝자리는 어차피 최대값이 들어가니 비교 X -1
			
			for(int j = 0; j<sort.length-1-i;j++) {	//뒤에서부터 최대값들이 채워져 나간다.
				
				if(sort[j]>sort[j+1]) {		// 오른쪽은 값이 채워나가고, J는 왼쪽에서부터  Sort를 수행한다.			
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
