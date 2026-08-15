import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String nStr = sc.next();
        if (nStr == null) return;
        
        int N = Integer.parseInt(nStr);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> counts = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < N; i++) {
            int val = A[i];
            
            if (val < 31623) {
                int sq = val * val;
                if (counts.containsKey(sq)) {
                    ans += counts.get(sq);
                }
            }
            counts.put(val, counts.getOrDefault(val, 0) + 1);
        }

        System.out.println(ans);
    }
}