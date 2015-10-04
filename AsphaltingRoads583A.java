// 583A - Asphalting Roads
// http://codeforces.com/problemset/problem/583/A
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AsphaltingRoads583A
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] hv = new boolean[n+1];
        boolean[] vv = new boolean[n+1];
        
        List<Integer> worked = new ArrayList<Integer>();
        int day = 1;
        int iter = n*n;
        while (iter-- > 0) {
            int h = sc.nextInt();
            int v = sc.nextInt();
            
            if (!hv[h] && !vv[v]) {
                worked.add(day);
                hv[h] = true;
                vv[v] = true;
            }
            
            day++;
        }
        
        if (worked.size() > 0) System.out.print(worked.get(0));
        for (int i = 1; i < worked.size(); i++) {
            System.out.print(" "+worked.get(i));
        }
        System.out.println();
    }
}