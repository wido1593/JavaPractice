package array;
import java.util.*;
public class Morse {
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�𽺺�ȣ�� ��ȯ�ϰ� ���� ���ڿ��� �Է����ּ��� : ");
	String source = scanner.nextLine().toUpperCase();//�빮�� ��ȯ
	
	String[] morse = {".-","-...","-.-","-..","."
					,"..-.","--.","....","..","---"
					,"-.-",".-..","--","-.","---"
					,".--.","--.-",".-.","...","-"
					,"..-","...-",".--","-..-","-.--"
					,"--.."}; // �˹ٺ��� �ش��ϴ� �𽺺�ȣ �ʱ�ȭ
	
	String result= "" ; // ������� ������� String��ü
	
	for(int i  = 0;i < source.length() ;i++) {
		result+=morse[source.charAt(i)-'A']; // A�� �������� ���� ���° ���ĺ����� �˾Ƴ� �� �ִ�.		
	}
	System.out.println(source);
	System.out.println(result);
}
}
=======
package array;
import java.util.*;
public class Morse {
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�𽺺�ȣ�� ��ȯ�ϰ� ���� ���ڿ��� �Է����ּ��� : ");
	String source = scanner.nextLine().toUpperCase();//�빮�� ��ȯ
	
	String[] morse = {".-","-...","-.-","-..","."
					,"..-.","--.","....","..","---"
					,"-.-",".-..","--","-.","---"
					,".--.","--.-",".-.","...","-"
					,"..-","...-",".--","-..-","-.--"
					,"--.."}; // �˹ٺ��� �ش��ϴ� �𽺺�ȣ �ʱ�ȭ
	
	String result= "" ; // ������� ������� String��ü
	
	for(int i  = 0;i < source.length() ;i++) {
		result+=morse[source.charAt(i)-'A']; // A�� �������� ���� ���° ���ĺ����� �˾Ƴ� �� �ִ�.		
	}
	System.out.println(source);
	System.out.println(result);
}
}
