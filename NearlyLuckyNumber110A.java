// 110A - Nearly Lucky Number
// http://codeforces.com/problemset/problem/110/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class NearlyLuckyNumber110A
{
	public static HashSet<Character> lucky;
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int counter = 0;

		lucky = new HashSet<Character>(Arrays.asList('4', '7'));

		for (char c : s.toCharArray()) {
			if (lucky.contains(c)) counter++;
		}	

		// Output
		String output = isLuckyNumber(counter) ? "YES" : "NO";
		System.out.println(output);
	}	

	public static Boolean isLuckyNumber(int n) {
		String s = Integer.toString(n);
		
		for (char c : s.toCharArray()) {
			if (!lucky.contains(c)) {
				return false;	
			}
		}

		return true;
	}
}