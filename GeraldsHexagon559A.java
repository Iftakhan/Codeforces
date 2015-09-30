// 559A - Gerald's Hexagon
// http://codeforces.com/problemset/problem/559/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class GeraldsHexagon559A
{
	public static int totalTriangles = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
		// Get input
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		int side4 = sc.nextInt();
		int side5 = sc.nextInt();
		int side6 = sc.nextInt();

		// Sort the adjacent sides by length
		int[] firstHalf = {side6, side2};
		int[] secondHalf = {side3, side5};
		Arrays.sort(firstHalf);
		Arrays.sort(secondHalf);

		// Calculate triangles using longer adjacent edge for one side (one half of hexagon)
		calculate(2*side1-1, firstHalf[1]);

		// Subtract the extra triangles added 
		totalTriangles -= Math.pow((firstHalf[1]-firstHalf[0]), 2);

		// Calculate triangles using shorter adjacent edge for other side (other half of hexagon)
		calculate(2*side4-1, secondHalf[0]);

		// Output
		System.out.println(totalTriangles);
	}	

	public static void calculate(int base, int side) {
		int counter = 1;
		int lastAddition = base;

		while (counter <= side) {
			lastAddition += 2;
			totalTriangles += lastAddition;
			counter++;
		}
	}
}
