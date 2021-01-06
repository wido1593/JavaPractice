package string;

public class StringEx5 {
	public static void main(String args[]) {
		String fullName = "Hello.Java";
		
		int index = fullName.indexOf(".");
		
		String fileName = fullName.substring(0, index);
		
		String ext = fullName.substring(index + 1);
		//String ext = fullName.substring(index + 1 , fullName.length());
		
		
		System.out.println(fullName + "의 파일 이름은 " + fileName + "입니다");
		System.out.println(fullName + "의 확장자 이름은" + ext + "입니다");
				
	}
}
