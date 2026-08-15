import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(freqMap.get(arr[i]) + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}