import java.util.ArrayList;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, j = 0, k = 0;
        int nPos = pos.size();
        int nNeg = neg.size();

        while (i < nPos && j < nNeg) {
            if (k % 2 == 0) {
                arr.set(k++, pos.get(i++));
            } else {
                arr.set(k++, neg.get(j++));
            }
        }

        while (i < nPos) {
            arr.set(k++, pos.get(i++));
        }

        while (j < nNeg) {
            arr.set(k++, neg.get(j++));
        }
    }
}