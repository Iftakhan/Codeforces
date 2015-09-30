// 228A - Is your horseshoe on the other hoof?
// http://codeforces.com/problemset/problem/228/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Horseshoe228A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> shoes = new HashSet<Integer>();
		for (int i = 0; i < 4; i++) shoes.add(sc.nextInt());
		System.out.println(4-shoes.size());
	}	
}