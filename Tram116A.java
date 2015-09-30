// 116A - Tram
// http://codeforces.com/problemset/problem/116/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Tram116A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxCapacity = 0;
		int currentCapacity = 0;
		
		for (int i = 0; i < n; i++) {
			currentCapacity -= sc.nextInt();
			currentCapacity += sc.nextInt();

			if (currentCapacity > maxCapacity) maxCapacity = currentCapacity;
		}

		System.out.println(maxCapacity);
	}	
}