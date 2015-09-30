// 136A - Presents
// http://codeforces.com/problemset/problem/136/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Presents136A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] presents = new int[n+1];

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt(); // Number of friend that i is giving gift to
			presents[num] = i;
		}

		for (int i = 1; i < n; i++) {
			System.out.print(presents[i] + " ");
		}
		System.out.print(presents[n]);
	}	
}