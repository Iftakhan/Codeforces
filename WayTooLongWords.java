import java.util.*;
import java.lang.*;
import java.io.*;

public class WayTooLongWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Go through each word
		while (sc.hasNext()) {
			String word = sc.next();

			outputWord(word);
		}
	}

	public static void outputWord(String word) {
		int maxWordLength = 10;
		int wordLen = word.length();

		if (wordLen <= maxWordLength) {
			System.out.println(word);
			return;
		}

		String abbreviation = Character.toString(word.charAt(0))+Integer.toString(wordLen-2)+Character.toString(word.charAt(wordLen-1));
		System.out.println(abbreviation);
	}
}