// 583B - Robot's Task
// http://codeforces.com/problemset/problem/583/B
// Farwa Naqi

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RobotsTask583B
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n+1];
        boolean[] vis = new boolean[n+1];
        
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        
        int info = 0;
        int turns = 0;
        int index = 1;
        boolean forward = true;
        
        while (info != n) {
            if (a[index] <= info && !vis[index]) {
                info++;
                vis[index] = true;
            } else {
                if (index == n && forward) {
                    turns++;
                    forward = false;
                } else if (index == 1 && !forward) {
                    turns++;
                    forward = true;
                }
                
                if (forward) index++;
                else index--;
            }
        }
        
        System.out.println(turns);
    }
}