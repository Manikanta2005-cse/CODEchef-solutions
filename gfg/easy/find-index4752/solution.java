class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        int start = -1;
        int end = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (start == -1) {
                if (arr[left] == key) {
                    start = left;
                } else {
                    left++;
                }
            }

            if (end == -1) {
                if (arr[right] == key) {
                    end = right;
                } else {
                    right--;
                }
            }

            if (start != -1 && end != -1) {
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        return result;
    }
}