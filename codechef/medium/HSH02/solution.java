import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        Map<Long, Long> freqMap = new HashMap<>();
        long count = 0;
        
        // Iterate over each element treating it as A_j
        for (int j = 0; j < n; j++) {
            long val = a[j];
            long square = val * val; // Target A_i value
            
            // Check if A_i = A_j^2 appeared at an earlier index (i < j)
            if (freqMap.containsKey(square)) {
                count += freqMap.get(square);
            }
            
            // Record current element into frequency map for future indices
            freqMap.put(val, freqMap.getOrDefault(val, 0L) + 1L);
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}