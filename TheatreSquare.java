import java.util.*;
import java.lang.*;
import java.io.*;

public class TheatreSquare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();

		long length = n/a;
		long width = m/a;

		if (n%a != 0) {
			length++;
		}

		if (m%a != 0) {
			width++;
		}
		
		// Output
		System.out.println(length*width);
	}
}