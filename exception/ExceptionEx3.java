package exception;

public class ExceptionEx3 {
	public static void main(String args[]) {
		try {		
		Exception e = new Exception("���Ƿ� �߻���Ŵ");
		throw e;
		// == throw new Exception("���Ƿι߻�");
		} catch(Exception e) {
			
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
		
	}
	
	void method1() {
		
	}
}

