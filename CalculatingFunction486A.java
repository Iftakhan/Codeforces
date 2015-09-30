// 486A - Calculating Function
// http://codeforces.com/problemset/problem/486/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class CalculatingFunction486A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long fn;
		
		// Calculate
		if (n%2 == 0) fn = n/2;
		else fn = (-1)*(n/2 + 1);
		
		// Output
		System.out.println(fn);
	}	
}