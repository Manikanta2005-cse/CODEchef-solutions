import java.util.*;

class Solution {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public List<Integer> findLeaders(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int maxSoFar = Integer.MIN_VALUE;
        Node head = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxSoFar) {
                maxSoFar = nums[i];
                Node newNode = new Node(nums[i]);
                newNode.next = head;
                head = newNode;
            }
        }

        List<Integer> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }

        return result;
    }
}