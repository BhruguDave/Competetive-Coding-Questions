package codeforces;
import java.util.*;
import java.io.*;
;
public class cf686C {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine());
			String in = br.readLine();
			String[] str = in.split(" ");
			
			int[] arr = new int[n];
			for(int i=0;i<n;i++)	arr[i] = Integer.parseInt(str[i]);
			
			
			List<Integer> ls = new ArrayList<>();
			for(int i:arr)
				if(!ls.contains(i))
					ls.add(i);
			
			int minP = Integer.MAX_VALUE;
			for(int i=0;i<ls.size();i++)
			{
				String finl = in;
				String reg = Integer.toString(ls.get(i));
				int part = 0;
				String[] fin = finl.split(reg);
				for(int j=0;j<fin.length;j++)
				{
					
					if(fin[j].length() > 1)
					{
						part++;
					}
				}
				
				
				minP = Math.min(minP, part);
			}
			
			System.out.println(minP);
			
		}
	}
}
