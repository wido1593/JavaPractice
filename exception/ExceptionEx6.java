package exception;

public class ExceptionEx6 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e;
			//throw new Exception("���Ƿ� �߻���Ŵ");
		}
		catch(Exception e) { 
			System.out.println("�����޼��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
