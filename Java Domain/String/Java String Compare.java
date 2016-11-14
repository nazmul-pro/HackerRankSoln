import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int k = in.nextInt();
        String temp = "", min = word, max = "";
        
        for(int i=0; i<=word.length()-k; i++){
            temp = word.substring(i,i+k);
            if(temp.compareTo(min)<0)
                min = temp;
            if(temp.compareTo(max)>0)
                max = temp;
        }
        
        System.out.print(min +"\n"+ max);
    }
}