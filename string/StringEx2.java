package string;

import java.util.StringJoiner;

public class StringEx2 {
	public static void main(String args[]) {
		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) {
			sj.add(s);
		}
		System.out.println(sj.toString()); 
		
		
		String animal2 = "zibra/bird/lion";
		String[] arr2 = animal2.split("/");
		
		System.out.println(String.join("&", arr2));
		
		StringJoiner sj2 = new StringJoiner("-", "{", "}");
		
		for(String s : arr2) {
			sj2.add(s);
		}
		
		System.out.println(sj2.toString());
	}
}
