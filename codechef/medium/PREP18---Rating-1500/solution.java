import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int na = Integer.parseInt(st.nextToken());
            int nb = Integer.parseInt(st.nextToken());
            int nc = Integer.parseInt(st.nextToken());

            long[] a = new long[na];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < na; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            long[] b = new long[nb];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < nb; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }

            long[] c = new long[nc];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < nc; i++) {
                c[i] = Long.parseLong(st.nextToken());
            }

            int i = 0, j = 0, k = 0;
            long minDiff = Long.MAX_VALUE;

            while (i < na && j < nb && k < nc) {
                long maxVal = Math.max(a[i], Math.max(b[j], c[k]));
                long minVal = Math.min(a[i], Math.min(b[j], c[k]));

                minDiff = Math.min(minDiff, maxVal - minVal);

                if (minVal == a[i]) {
                    i++;
                } else if (minVal == b[j]) {
                    j++;
                } else {
                    k++;
                }
            }

            System.out.println(minDiff);
        }
    }
}