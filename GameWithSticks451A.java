// 451A - Game with Sticks
// http://codeforces.com/problemset/problem/451/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class GameWithSticks451A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		if (n == 1 || m == 1) System.out.println("Akshat");
		else if ((n*m)%2 == 0) System.out.println("Malvika");
		else System.out.println("Akshat");		
	}	
}