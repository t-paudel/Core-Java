package geekForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumPlatform {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of trains string");
		int num = Integer.parseInt(br.readLine());
		
		int[] arrival = new int[num];
		int[] departure = new int[num];
		
		for(int i = 0;i<num;i++)
		{
			System.out.println("Enter arrival time of train "+(i+1));
			arrival[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i<num;i++)
		{
			System.out.println("Enter departure time of train "+(i+1));
			departure[i] = Integer.parseInt(br.readLine());
		}
		
			
		System.out.println(calculateMinimum(num, arrival, departure));
	}
	
	public static int calculateMinimum(int num, int[] arr, int[] dep) {
		int platform_needed=1,result=1;
		int i=1,j=0;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		while(i<num && j<num) {
			if(arr[i]<=dep[j]) {
				platform_needed++;
				i++;
				if(result<platform_needed)
					result=platform_needed;
			}
			else {
				platform_needed--;
				j++;
			}
		}	
		return result;
	}
}
