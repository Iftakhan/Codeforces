// 557B - Pasha and Tea
// http://codeforces.com/contest/557/problem/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class PashaAndTea557B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double w = sc.nextDouble();

		// Get teacup capacities
		List<Double> teacups = new ArrayList<Double>();
		while (sc.hasNext()) {
			teacups.add(sc.nextDouble());
		}

		Collections.sort(teacups);

		// Divide w into x units
		double x = w/(3*n);

		if (2*x > teacups.get((int)n)) {
			x = teacups.get((int)n)/2;
		}

		if (x > teacups.get(0)) {
			x = teacups.get(0);
		}

		// Assign x ml of water to first half (girls), and 2x ml of water to second half (boys)
		double total = (n*x)+(2*n*x);
		System.out.println(total);
	}
}