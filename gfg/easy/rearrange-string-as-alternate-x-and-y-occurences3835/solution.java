class Solution {
    public String arrangeString(String s, int x, int y) {
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (count0 > 0 && count1 > 0) {
            int take0 = Math.min(x, count0);
            for (int i = 0; i < take0; i++) {
                sb.append('0');
            }
            count0 -= take0;

            int take1 = Math.min(y, count1);
            for (int i = 0; i < take1; i++) {
                sb.append('1');
            }
            count1 -= take1;
        }

        while (count0 > 0) {
            sb.append('0');
            count0--;
        }

        while (count1 > 0) {
            sb.append('1');
            count1--;
        }

        return sb.toString();
    }
}