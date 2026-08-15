import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findUniquePair(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int rightmostSetBit = xor & -xor;

        int first = 0;
        int second = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (first < second) {
            result.add(first);
            result.add(second);
        } else {
            result.add(second);
            result.add(first);
        }

        return result;
    }
}