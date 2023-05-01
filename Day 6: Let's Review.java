import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
       sc.nextLine();
      
          for(int i=0;i<test;i++){
           
            String a = sc.nextLine();
            String even = "";
            String odd = "";
            
        char ch[] = a.toCharArray();
         
            for(int j=0;j<ch.length;j++){
                   
                   if(j%2==0){
                       even+= ch[j];    //hce 
                   } else {
                       odd+= ch[j];   //akr
                   }
             }
    
        
           System.out.println(even +" "+ odd);
        //    System.out.println();
    }
    }
}









