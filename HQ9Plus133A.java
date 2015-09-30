// 133A - HQ9+
// http://codeforces.com/problemset/problem/133/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class HQ9Plus133A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		HashSet<Character> valid = new HashSet<Character>();
		valid.add('H');
		valid.add('Q');
		valid.add('9');

		// Figure out if any instruction creates output
		Boolean doesOutput = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (valid.contains(c)) {
				doesOutput = true;
				break;
			}
		}

		// Output
		String output = doesOutput ? "YES" : "NO";
		System.out.println(output);
	}	
}