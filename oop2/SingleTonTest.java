package oop2;

class SingleTon{
	
	 private static SingleTon s = new SingleTon();
	
	private SingleTon() { }
	
	public static SingleTon getInstance() {
		if( s ==null) {s = new SingleTon();}
		return s;
	}
	
}

public class SingleTonTest {

	public static void main(String args[]) {
		
		//SingleTon s = new SingleTon(); 
		SingleTon s = SingleTon.getInstance();
	}
	
}
