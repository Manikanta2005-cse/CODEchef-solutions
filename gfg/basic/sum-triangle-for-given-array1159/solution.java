import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        buildTriangle(arr, result);
        return result;
    }

    private void buildTriangle(int[] arr, ArrayList<Integer> result) {
        
        if (arr.length < 1) {
            return;
        }
        int[] nextRow = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            nextRow[i] = arr[i] + arr[i + 1];
        }

        buildTriangle(nextRow, result);

        for (int num : arr) {
            result.add(num);
        }
    }
}