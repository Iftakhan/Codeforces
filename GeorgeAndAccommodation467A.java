// 467A - George and Accommodation
// http://codeforces.com/problemset/problem/467/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class GeorgeAndAccommodation467A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Count
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (Math.abs(sc.nextInt()-sc.nextInt()) >= 2) counter++;
		}

		// Output
		System.out.println(counter);
	}	
}