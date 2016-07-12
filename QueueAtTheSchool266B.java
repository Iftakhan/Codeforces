// 266B - Queue at the School
// http://codeforces.com/problemset/problem/266/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class QueueAtTheSchool266B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String s = sc.next();
		char[] queue = s.toCharArray();
		
		for (int i = 1; i <= t; i++) {
			for (int j = 0; j < n-1; j++) {
				if (queue[j] == 'B' && queue[j+1] == 'G') {
					queue[j] = 'G';
					queue[j+1] = 'B';
					j+=1;
				}
			}
		}
		
		System.out.println(new String(queue));
	}
}