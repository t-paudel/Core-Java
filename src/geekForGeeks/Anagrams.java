package geekForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string");
		String str1 = br.readLine();
		System.out.println("Enter second string");
		String str2 = br.readLine();
		
		System.out.println(checkAnagram(str1, str2));
	}
	
	public static boolean checkAnagram(String str1, String str2) {
		boolean result=false;
		if(str1.length()!=str2.length())
			result = false;
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				result = false;
				break;
			}
			result=true;
		}
		
		return result;
	}
}
