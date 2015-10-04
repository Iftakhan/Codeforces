// 580A - Kefa and First Steps
// http://codeforces.com/problemset/problem/580/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class KefaAndFirstSteps580A
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int lastNum = sc.nextInt();
        int counter = 1;
        int maxCounter = 0;
        
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (num >= lastNum) {
                counter++;
            } else {
                if (counter > maxCounter) maxCounter = counter;
                counter = 1;
            }
            
            lastNum = num;
        }
        
        if (maxCounter == 0 || counter > maxCounter) maxCounter = counter;
        
        System.out.println(maxCounter);
    }
}