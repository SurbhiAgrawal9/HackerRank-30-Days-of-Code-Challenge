//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String,Integer> p = new HashMap<String,Integer>();
        
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            p.put(name,phone);
        }
        while(in.hasNext()){
           
            // Write code here
            String s = in.next();
            if(p.containsKey(s)){
                
                int num =p.get(s);
                System.out.println(s + "="+ num);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
