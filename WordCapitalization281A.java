// 281A - Word Capitalization
// http://codeforces.com/problemset/problem/281/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class WordCapitalization281A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		// Print first char as upper case
		System.out.print(Character.toUpperCase(s.charAt(0)));
		
		for (int i = 1; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}	
}