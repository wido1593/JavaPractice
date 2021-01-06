package array;
import java.util.*;
public class Morse {
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("모스부호로 변환하고 싶은 문자열을 입력해주세요 : ");
	String source = scanner.nextLine().toUpperCase();//대문자 변환
	
	String[] morse = {".-","-...","-.-","-..","."
					,"..-.","--.","....","..","---"
					,"-.-",".-..","--","-.","---"
					,".--.","--.-",".-.","...","-"
					,"..-","...-",".--","-..-","-.--"
					,"--.."}; // 알바벳에 해당하는 모스부호 초기화
	
	String result= "" ; // 결과값을 담기위한 String객체
	
	for(int i  = 0;i < source.length() ;i++) {
		result+=morse[source.charAt(i)-'A']; // A를 빼줌으로 인해 몇번째 알파벳인지 알아낼 수 있다.		
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
	
	System.out.println("모스부호로 변환하고 싶은 문자열을 입력해주세요 : ");
	String source = scanner.nextLine().toUpperCase();//대문자 변환
	
	String[] morse = {".-","-...","-.-","-..","."
					,"..-.","--.","....","..","---"
					,"-.-",".-..","--","-.","---"
					,".--.","--.-",".-.","...","-"
					,"..-","...-",".--","-..-","-.--"
					,"--.."}; // 알바벳에 해당하는 모스부호 초기화
	
	String result= "" ; // 결과값을 담기위한 String객체
	
	for(int i  = 0;i < source.length() ;i++) {
		result+=morse[source.charAt(i)-'A']; // A를 빼줌으로 인해 몇번째 알파벳인지 알아낼 수 있다.		
	}
	System.out.println(source);
	System.out.println(result);
}
}
