// 460A - Vasya and Socks
// http://codeforces.com/problemset/problem/460/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class VasyaAndSocks460A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int counter = n+(n/m);
		int days = n/m+n%m; 

		while (days >= m) {
			counter += days/m; // counter = 144
			int rem = days%m; // rem = 1
			days /= m; // days = 11
			days += rem; // days = 12
		}

		System.out.println(counter);
	}	
}