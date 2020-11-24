package codeforces;
import java.util.*;
import java.io.*;
;
public class cf686B {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] arr = new int[n];
			for(int i=0;i<n;i++)	arr[i] = Integer.parseInt(str[i]);
			
			if(n == 1)
			{
				System.out.println(1);
				continue;
			}
			else
			{
				Map<Integer,Integer> map = new HashMap<>();
				
				for(int i:arr)
				{
					map.put(i, map.getOrDefault(i,0)+1);
				}
				
				int min = Integer.MAX_VALUE;
				
				for(int i=0;i<n;i++)
				{
					if(map.get(arr[i]) == 1)
						min = Math.min(min, arr[i]);
				}
				
				int imin = -1;
				for(int i=0;i<n;i++)
				{
					if(arr[i] == min)
					{
						imin = i;
						break;
					}
				}
				
				if(imin == -1)
					System.out.println(imin);
				else
					System.out.println(imin+1);
			}
		}
	}
}
