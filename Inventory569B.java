// 569B - Inventory
// http://codeforces.com/contest/569/problem/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Inventory569B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] frequency = new int[n];

		List<Integer> a = new ArrayList<Integer>();
		while (sc.hasNext()) {
			int num = sc.nextInt();
			a.add(num);

			// Only increment frequency of valid numbers (1 to n)
			if (num > 0 && num <= n) {
				frequency[num-1]++;
			}
		}

		// Find all the missing nums
		List<Integer> missingNums = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (frequency[i] == 0) {
				missingNums.add(i+1);
			}
		}

		int index = 0;

		// Iterate the inventory and find duplicate/out-of-bound numbers
		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i);

			// Check for two error cases (greater than n or duplicate)
			if (num > n) {
				System.out.print(missingNums.get(index)+" ");
				index++;
			} else if (frequency[num-1] > 1) {
				System.out.print(missingNums.get(index)+" ");
				index++;
				frequency[num-1]--;
			} else {
				System.out.print(num+" ");
			}
		}
	}	
}