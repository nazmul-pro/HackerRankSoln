import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // creating list
        List<Integer>[] seqList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            seqList[i] = new ArrayList<Integer>();
            }
        int Q = scan.nextInt(); //read query
        int lastAns = 0;
        //read query , x , y
        while (Q-- > 0) {
            int q = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            //xor
            int seq = (x ^ lastAns) % N;
        switch (q) {
        case 1:
    	   seqList[seq].add(y);
            break;
    
        case 2:
            //follow prob. statement
    	   lastAns = seqList[seq].get(y % seqList[seq].size());
            System.out.println(lastAns);
            break;
            }
        }
        scan.close();
    }
}