// 560B - Gerald is into Art
// http://codeforces.com/problemset/problem/560/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class GeraldIsIntoArt560B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Get input
		Scanner scanner = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();

		// Output strings
		String yes = "YES";
		String no = "NO";

		// Check area first
		if (a1*b1 < (a2*b2)+(a3*b3)) {
			System.out.println(no);
			return;
		}

		// Sort
		if (b1 < a1) {
			int temp = a1;
			
		}
	}	
}