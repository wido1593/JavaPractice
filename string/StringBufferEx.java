package string;

public class StringBufferEx {
	public static void main(String args[]) {
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		
		sb.append("123");
		System.out.println(sb);
		
		sb.append("ZZ").append("YY");
		
		System.out.println(sb);
		
		
		StringBuffer sb2 = new StringBuffer("ABC");
		StringBuffer sb3 = new StringBuffer("ABC");
		
		System.out.println("sb2 == sb3 ? " + (sb2 == sb3));
		System.out.println("sb2.equals(sb3) ? " + sb2.equals(sb3) );
		
		String s2 = sb2.toString();
		String s3= sb2.toString();
		
		System.out.println("s2 == s3 ? " + (s2 == s3));
		System.out.println("s2.equals(s3) ? " + s2.equals(s3) );
	}
}
