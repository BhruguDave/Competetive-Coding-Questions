package codeforces;
import java.util.*;
import java.io.*;
;
public class cf686A {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++)
				arr[i] = i+2;
			
			arr[n-1] = 1;
			
			for(int i:arr)
				System.out.print(i+" ");
			
			System.out.println();
		}
	}
}
