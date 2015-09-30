// 160A - Twins
// http://codeforces.com/problemset/problem/160/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Twins160A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coins = new int[n];
		int sum = 0;

		// Multiply by -1 to sort in decreasing order later
		for (int i = 0; i < n; i++) {
			int coin = sc.nextInt();
			coins[i] = coin*-1;
			sum += coin;
		}

		// Sort in decreasing order
		Arrays.sort(coins);
		int counter = 0;

		int greaterSum = 0;
		for (int i = 0; i < n; i++) {
			int coin = coins[i]*-1;
			greaterSum += coin;
			sum -= coin;
			counter++;

			if (greaterSum > sum) break;
		}

		// Output
		System.out.println(counter);
	}	
}