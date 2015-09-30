// 148A - Insomnia Cure
// http://codeforces.com/problemset/problem/148/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class InsomniaCure148A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();

		// Count dragons that get injured
		int counter = 0;
		for (int i = 1; i <= d; i++) if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0) counter++;

		// Output
		System.out.println(counter);
	}	
}