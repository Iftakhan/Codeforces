// 459A - Pashmak and Garden
// http://codeforces.com/problemset/problem/459/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class PashmakAndGarden459A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int side;
		if (x1 == x2) {
			side = Math.abs(y1-y2);
		} else if (y1 == y2) {
			side = Math.abs(x1-x2);
		} else {
			if (Math.abs(x1-x2) != Math.abs(y1-y2)) {
				System.out.println("-1");
				return;
			}

			side = Math.abs(x1-x2); // Measure horizontal distance (can also measure vertical)
		}

		// Otherwise print out the other points of the square
		int x3, x4, y3, y4;
		if (x1 == x2) {
			x3 = x1+side; y3 = y1; x4 = x2+side; y4 = y2;
		} else if (y1 == y2) {
			x3 = x1; y3 = y1+side; x4 = x2; y4 = y2+side;
		} else {
			if (x1 < x2) {
				x3 = x1+side; x4 = x2-side;
			} else {
				x3 = x1-side; x4 = x2+side;
			}
			y3 = y1; y4 = y2;
		}

		// Output
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}	
}