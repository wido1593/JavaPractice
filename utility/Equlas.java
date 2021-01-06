package utility;

public class Equlas {
	public static void main(String args[]) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("µÎ °´Ã¼´Â °°½À´Ï´Ù.");
		} else {
			System.out.println("µÎ °´Ã¼´Â´Ù¸¨´Ï´Ù.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("µÎ °´Ã¼´Â °°½À´Ï´Ù.");
		} else {
			System.out.println("µÎ °´Ã¼´Â´Ù¸¨´Ï´Ù.");
		}
	
	}
}

class Value { 
	int value;
	
	Value(int value){
		this.value = value;
	}
}