import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String s = sc.next();
        
        TreeMap<Character, Integer> mp = new TreeMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= k) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        
        sc.close();
    }
}