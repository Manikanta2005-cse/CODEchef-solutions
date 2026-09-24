class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int n = arr1.length;
        int m = arr2.length;

        int left = 0;
        int right = m - 1;

        int diff = Integer.MAX_VALUE;
        int res1 = -1;
        int res2 = -1;

        while (left < n && right >= 0) {
            int sum = arr1[left] + arr2[right];

            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum - x);
                res1 = arr1[left];
                res2 = arr2[right];
            }

            if (sum > x) {
                right--;
            } else {
                left++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);

        return result;
    }
}