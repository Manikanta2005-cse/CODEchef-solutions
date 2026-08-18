import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
            }
            
            int maxFreq = 0;
            int maxCount = 0;
            for (int freq : freqMap.values()) {
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxCount = 1;
                } else if (freq == maxFreq) {
                    maxCount++;
                }
            }
            
            if (maxCount == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}