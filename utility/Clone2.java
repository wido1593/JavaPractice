package utility;

import java.util.Arrays;

public class Clone2 {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();
		//System.arraycopy(arr, 0, arrClone, 0, arr.length);
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arr));
	}
}
