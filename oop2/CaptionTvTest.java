package oop2;

class Tv{
	boolean power;
	int  channel;	
	
	void  power() { power = !power; }
	void chanellUp() { ++channel;}
	void chanellDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
			}
	}
}


public class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.chanellUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello world");
		ctv.caption = true;
		ctv.displayCaption("Hello world");
		
	}
	
}


