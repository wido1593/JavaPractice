package string;

public class StringEx5 {
	public static void main(String args[]) {
		String fullName = "Hello.Java";
		
		int index = fullName.indexOf(".");
		
		String fileName = fullName.substring(0, index);
		
		String ext = fullName.substring(index + 1);
		//String ext = fullName.substring(index + 1 , fullName.length());
		
		
		System.out.println(fullName + "�� ���� �̸��� " + fileName + "�Դϴ�");
		System.out.println(fullName + "�� Ȯ���� �̸���" + ext + "�Դϴ�");
				
	}
}
