import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();  //triming
        if(s.length()==4*Math.pow(10, 5)){
        System.out.println();
        }
        else if(s.length()==0){
           System.out.println(s.length()); 
        }
        else{
           String delimiters = "[-_\\@ !,?.']+"; 
            // analyze the string 
            String[] tokensVal = s.split(delimiters);
             System.out.println(tokensVal.length);
    
         for(String token : tokensVal) {
                System.out.println(token);
               }
        }    
        scan.close();
    }
}