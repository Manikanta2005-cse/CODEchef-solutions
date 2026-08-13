import java.util.ArrayList;

class Solution {
    ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        // Alternate positive and negative
        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }

        // Add remaining positive numbers
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        // Add remaining negative numbers
        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        return ans;
    }
}