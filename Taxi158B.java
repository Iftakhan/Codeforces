// 158B - Taxi
// http://codeforces.com/problemset/problem/158/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Taxi158B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;

		int[] frequency = new int[5];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			frequency[num]++;
			total += num;
		}

		int spaceInTaxi, index;
		int taxis = 0;
		int totalKids = 0;

		while (totalKids < total) {
			index = 4;
			taxis++;
			spaceInTaxi = 4;
			while (index > 0 && spaceInTaxi > 0) {
				if (frequency[index] > 0) {
					int groups = frequency[index]-(spaceInTaxi/index) >= 0 ? (spaceInTaxi/index) : frequency[index];
					frequency[index] -= groups;
					spaceInTaxi -= groups*index;
					totalKids += groups*index;
				}
				index--;
			}
		}

		System.out.println(taxis);
	}	
}