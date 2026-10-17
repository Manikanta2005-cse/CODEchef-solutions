import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (a > b) { int temp = a; a = b; b = temp; }
            if (b > c) { int temp = b; b = c; c = temp; }
            if (a > b) { int temp = a; a = b; b = temp; }
            
            System.out.println(a + " " + b + " " + c);
        }
    }
}