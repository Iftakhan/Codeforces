// 41A - Translation
// http://codeforces.com/problemset/problem/41/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Translation41A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		if (s.length() != t.length()) {
			System.out.println("NO");
			return;
		}

		int l = s.length();

		for (int i = 0; i < l; i++) {
			if (s.charAt(i) != t.charAt(l-i-1)) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}	
}