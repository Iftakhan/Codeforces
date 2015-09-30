// 82A - Double Cola
// http://codeforces.com/problemset/problem/82/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class DoubleCola82A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()-1;

		// Names
		String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

		for (; n >= 5;) {
			n -= 5;
			n >>= 1;
		}

		System.out.println(names[n]);
	}	
}