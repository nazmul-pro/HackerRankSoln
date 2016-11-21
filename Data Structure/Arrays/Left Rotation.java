import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        //read n,d
		 int n = scan.nextInt();
		 int d = scan.nextInt();
		 int[] arr = new int[n];
        //read array element
		 for(int g=0;g<=n-1;g++)
		 {
			 arr[g] = scan.nextInt();
		 }
		 
		 int[] temp = new int[d];
		 //transfer element to temp
		 for(int h=0;h<=d-1;h++)
		 {
			 temp[h] = arr[h];
		 }
        //shift rest element left
		 for(int i=0;i<=n-d-1;i++)
		 {
			 arr[i] = arr[i+d];
		 }
        //make full array after left rotation
		 for(int k=n-d;k<n;k++)
		 {
			 arr[k] = temp[k-(n-d)];
		 }
        //printing result array
		 for(int j =1;j<=n;j++)
		 {
			 System.out.printf("%d ",arr[j-1]);
		 }
    }
}