// 569A - Music
// http://codeforces.com/contest/569/problem/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

public class Music569A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double s = sc.nextDouble();
		double q = sc.nextDouble();

		// Counters
		int numTimesSongPlayed = 0;
		double secondsDownloaded = 0;
		int listened = 0;
		Boolean isListening = false;

		// Calculate portion of song that's downloaded every second
		double songPerSecond = (q-1)/q;

		while (secondsDownloaded <= t) {
			// Add the portion of the song that's downloaded every second
			secondsDownloaded += songPerSecond;
			secondsDownloaded = roundDouble(secondsDownloaded);

			// If the song is downloaded, stop counting
			if (secondsDownloaded == t) {
				break;
			}

			// If person is listening, increment the listening count
			if (isListening) {
				listened++;

				// If they've reached the point of no more song, re-start the song
				if (listened > secondsDownloaded) {
					System.out.println("listened to " + listened + " of " + secondsDownloaded + " seconds.");
					listened = 0;
					numTimesSongPlayed++;
				}
			}

			// Start to listen to the song once threshold is reached/passed
			if (numTimesSongPlayed == 0 && secondsDownloaded >= s) {
				isListening = true;
				numTimesSongPlayed++;
			}
		}

		System.out.println("listened to " + listened + " of " + secondsDownloaded + " seconds.");
		// Output
		System.out.println(numTimesSongPlayed);
	}	

	public static double roundDouble(double num) {
		num = Math.round(num*100);
		num = num/100;

		return num;
	}
}