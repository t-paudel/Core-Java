package geekForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
	static Set<String> perm = new HashSet<>();
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String input = br.readLine();
		permutation(input);
		
		System.out.println(perm);
		System.out.println("Combinations = " + perm.size());
	}
	
	public static void permutation(String str) {
		permutation("",str);
	}
	
	private static void permutation(String fixed, String remaining) {
		if(remaining.isEmpty())
			perm.add(fixed+remaining);
		else {
			for(int i=0;i<remaining.length();i++)
				permutation(fixed+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1, remaining.length()));
		}
			
	}
}
