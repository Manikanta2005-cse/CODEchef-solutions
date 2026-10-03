import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String s = sc.next();
        
        if (!sc.hasNext()) return;
        char c = sc.next().charAt(0);
        
        int index = s.indexOf(c);
        System.out.println(index);
    }
}