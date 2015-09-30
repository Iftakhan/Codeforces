// 112A - Petya and Strings
// http://codeforces.com/problemset/problem/112/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class PetyaAndStrings112A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		int output = 0;
		if (s1.compareToIgnoreCase(s2) < 0) output = -1;
		else if (s1.compareToIgnoreCase(s2) > 0) output = 1;

		System.out.println(output);
	}	
}