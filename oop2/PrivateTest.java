package oop2;

class Time{
	
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);	
		setMinute(minute);	
		setSecond(second);	
	}
	
	public int getHour() {	return this.hour;	}
	public void setHour(int hour){
		if( hour <= 0 || hour > 24 ) return;
		this.hour = hour;
	}
	
	public int getMinute() { return this.minute; }
	public void setMinute(int minute) {
		if(minute < 1 || minute > 60) return;
		this.minute = minute;
	}
	
	public int getMSecond() { return this.second; }
	public void setSecond(int second) {
		if(second < 0 || second > 60) return;
		this.second = second;
	}
	
	public String toString() {
		return "½Ã°£ :"  + hour + ":" +  minute + ":" + second; 
	}
	
}

public class PrivateTest {
	
	public static void main(String args[]) {
		
		Time t = new Time(22,5,10);
		System.out.println(t);
		
		t.setHour(t.getHour() + 1);
		System.out.println(t);
		
	}
	
}
