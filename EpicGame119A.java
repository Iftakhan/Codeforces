// 119A - Epic Game
// http://codeforces.com/problemset/problem/119/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class EpicGame119A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		int turn = 1;

		while (n >= 0) {
			// Simon's turn is 1, Antisimon is 0
			if (turn%2 == 1) {
				int gcd = gcd(a, n);
				if (n-gcd >= 0) {
					n -= gcd;
				} else {
					System.out.println("1"); // Antisimon wins
					return;
				}
			} else {
				int gcd = gcd(b, n);
				if (n-gcd >= 0) {
					n -=gcd;
				} else {
					System.out.println("0"); // Simon wins
					return;
				}
			}

			turn++;
		}
	}	

	private static int gcd(int a, int b) 
	{
	    BigInteger b1 = BigInteger.valueOf(a);
	    BigInteger b2 = BigInteger.valueOf(b);
	    BigInteger gcd = b1.gcd(b2);

	    return gcd.intValue();
	}
}