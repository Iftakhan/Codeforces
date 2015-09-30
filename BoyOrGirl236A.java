// 236A - Boy or Girl
// http://codeforces.com/problemset/problem/236/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class BoyOrGirl236A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		HashSet<Character> used = new HashSet<Character>();

		// Add letters to set
		for (char c : s.toCharArray()) used.add(c);

		// Output
		String output = used.size()%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
		System.out.println(output);
	}	
}