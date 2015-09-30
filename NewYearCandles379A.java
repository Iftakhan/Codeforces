// 379A - New Year Candles
// http://codeforces.com/problemset/problem/379/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class NewYearCandles379A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int counter = a+(a/b);
		int hours = a/b+a%b; 

		while (hours >= b) {
			counter += hours/b; 
			int rem = hours%b; 
			hours /= b; 
			hours += rem; 
		}

		System.out.println(counter);
	}	
}