import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            mp.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
        System.out.println();
    }
}
