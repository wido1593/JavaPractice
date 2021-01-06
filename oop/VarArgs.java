package oop;

public class VarArgs {
	public static void main(String args[]) {
		
		String var[] = {"100", "200", "300" } ;
		
		System.out.println(concatenate(" ", "100", "200", "300"));
		System.out.println(concatenate("-", var));
		System.out.println(concatenate(",", new String[]{"1","2","3"}));
				
	}
	
	static String concatenate(String delim, String... args) {
		
		String result = "";
		
		for(String str : args)
			result += str + delim;
		
		return result;
	}
}
