// 122A - Lucky Division
// http://codeforces.com/problemset/problem/122/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class LuckyDivision122A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Boolean almostLucky = false;

		for (int i = 1; i <= n; i++) {
			if (isLuckyNumber(i) && n%i == 0) {
				almostLucky = true; 
				break;
			}
		}	

		// Output
		String output = almostLucky ? "YES" : "NO";
		System.out.println(output);
	}	

	public static Boolean isLuckyNumber(int n) {
		HashSet<Character> lucky = new HashSet<Character>();
		lucky.add('4');
		lucky.add('7');

		String s = Integer.toString(n);
		
		for (char c : s.toCharArray()) {
			if (!lucky.contains(c)) {
				return false;	
			}
		}

		return true;
	}
}