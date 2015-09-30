// 131A - cAPS lOCK
// http://codeforces.com/problemset/problem/131/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class CapsLock131A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Boolean transform = false;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0 && Character.isUpperCase(c)) {
				transform = true;
				sb.append(Character.toLowerCase(c));

				continue;
			} 

			if (i == 0 && Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
				transform = true;

				continue;
			}

			if (transform && Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				transform = false;
				break;
			}
		}

		if (transform) System.out.println(sb.toString());
		else System.out.println(s);
	}	
}