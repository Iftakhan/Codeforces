import java.util.*;
import java.lang.*;
import java.io.*;

public class Watermelon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		
		double half = w/2;
		Boolean output = canDivideWatermelon(w, half);

		if (output) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static Boolean canDivideWatermelon(double w, double half) 
	{
		// Base cases
		if (w == 1.0 || half <= 1.0) return false;
		if (half%2 == 0) return true;

		// Check if half is an odd number or decimal
		if (half%2 == 1) half--;
		else half = Math.floor(half);

		double otherHalf = w-half;
		
		// Might have two even halves at this point
		if (half%2 == 0 && otherHalf%2 == 0) return true;

		Boolean firstHalf = canDivideWatermelon(half, half/2);
		Boolean secondHalf = canDivideWatermelon(otherHalf, otherHalf/2);

		if (firstHalf && secondHalf) {
			return true;
		}

		return false;
	}
}