package string;

public class StringEx4 {
	public static void main(String args[]) {
		int iVal = 100;
		String strVal1 = String .valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2= dVal + "";
		
		double sum = Integer.parseInt("+" + strVal1.trim()) + Double.parseDouble(strVal2);
		
		double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);
		
		System.out.println(String.join(" ", strVal1 , "+" , strVal2, "=") + sum);
		System.out.println(strVal1 + "+" + strVal2 + "=" + sum2);
	}
}
