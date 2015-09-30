// 461A - Appleman and Toastman
// http://codeforces.com/problemset/problem/461/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class ApplemanAndToastman461A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] nums = new long[n];
		for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

		// Sort and calculate
		Arrays.sort(nums);
		long score = nums[n-1]*n;
		for (int i = n-2; i >= 0; i--) score += nums[i]*(i+2);

		// Output
		System.out.println(score);
	}	
}