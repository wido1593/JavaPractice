package exception;

public class ExceptionEx5 {
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,30};
		
		System.out.println(1);
		
		try {			
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		
		System.out.println(50/0);
		//System.out.println(3/0);
		
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");
			ae.printStackTrace();			
		}
		
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException:");
			ae.printStackTrace();			
		}	
		
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println(2);
		System.out.println(3);
	}
	
}