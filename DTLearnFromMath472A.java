// 472A - Design Tutorial: Learn from Math
// http://codeforces.com/problemset/problem/271/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class DTLearnFromMath472A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int x = n/2;
		int y = n-x;
		
		while (x >= 4 && y <= n-4) {
			if (!isPrime(x) && !isPrime(y) && x+y == n) {
				System.out.println(x + " " + y);
				return;
			} else {
				x--;
				y++;
			}
		}	
	}

	public static Boolean isPrime(int n) {
	    if (n%2 == 0) return false;

	    for (int i = 3; i*i <= n; i += 2) {
	        if (n%i == 0) return false;
	    }

	    return true;
	}	
}