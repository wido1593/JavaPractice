package exception;

public class ExceptionEx2 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(1);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae){
			System.out.println("예외메시지" + ae.getMessage());
			ae.printStackTrace();
		}
	}
}
