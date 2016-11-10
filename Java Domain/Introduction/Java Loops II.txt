import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    in.nextLine();
    while(t!=0)
         {
    int a=in.nextInt();
    int b=in.nextInt();
    int n=in.nextInt();
    int sum=0;
    sum=sum+a;
    for(int i=0;i<n;i++)
        {

        sum=sum+((int)Math.round( Math.pow(2,i)*b));

        System.out.print( sum);
        System.out.print(" ");
    }
     System.out.println();
         t--;
     }
    }
}