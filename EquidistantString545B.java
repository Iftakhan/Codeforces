// 545B - Equidistant String
// http://codeforces.com/problemset/problem/545/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class EquidistantString545B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();

		// Size of string
		int n = s.length();

		// Counters
		int spDistance = 0;
		int tpDistance = 0;
		int distanceCounter = 1; // If this is even, increment sp, else increment tp

		StringBuilder p = new StringBuilder();

		// Iterate chars in strings ()
		for (int i = 0; i < n; i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);

			// If they're the same, add the char to string p
			if (sc == tc) {
				p.append(sc);
				continue;
			} 

			// Otherwise, add one or the other char, and increment the corresponding string distance counter
			if (distanceCounter%2 == 0) {
				p.append(sc);
				spDistance++;
			} else {
				p.append(tc);
				tpDistance++;
			}

			distanceCounter++;
		}

		// Output
		if (spDistance == tpDistance) {
			System.out.println(p.toString());
		} else {
			System.out.println("impossible");
		}
	}	
}