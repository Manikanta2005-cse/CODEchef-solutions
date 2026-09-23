import java.util.*;

public class Main {
    public static void sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                temp[index++] = num;
            }
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                temp[index++] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        sortArrayByParity(nums);

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + (i == N - 1 ? "" : " "));
        }
        System.out.println();
    }
}