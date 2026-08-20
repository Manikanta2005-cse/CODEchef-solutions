import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        if (!st.hasMoreTokens()) return;
        int t = Integer.parseInt(st.nextToken());
        
        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
            
            int minIndex = 1;
            int minValue = Integer.MAX_VALUE;
            
            for (int i = 1; i <= n; i++) {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int val = Integer.parseInt(st.nextToken());
                if (val < minValue) {
                    minValue = val;
                    minIndex = i;
                }
            }
            
            System.out.println(minIndex);
        }
    }
}