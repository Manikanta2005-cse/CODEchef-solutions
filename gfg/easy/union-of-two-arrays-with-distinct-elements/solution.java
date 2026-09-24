import java.util.*;

class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}