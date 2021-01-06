package exception;

public class ExceptionEx6 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			//throw new Exception("고의로 발생시킴");
		}
		catch(Exception e) { 
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}
