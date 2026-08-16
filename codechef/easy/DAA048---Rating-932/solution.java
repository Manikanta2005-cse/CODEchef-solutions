import java.util.Scanner;

public class Main {

    // Node structure for the custom Hash Map's linked list
    static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    // Custom Hash Map implementation
    static class CustomHashMap {
        private final int SIZE = 1007; // Prime bucket size for better distribution
        private Node[] table;

        public CustomHashMap() {
            table = new Node[SIZE];
        }

        // Hash function to map key to bucket index
        private int hash(int key) {
            return Math.abs(key % SIZE);
        }

        // Inserts key if not present; returns true if insert succeeded, false if duplicate found
        public boolean insert(int key) {
            int index = hash(key);
            Node current = table[index];

            // Check if key already exists in the bucket
            while (current != null) {
                if (current.key == key) {
                    return false; // Duplicate detected!
                }
                current = current.next;
            }

            // Insert new key at the head of the chain
            Node newNode = new Node(key);
            newNode.next = table[index];
            table[index] = newNode;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            CustomHashMap map = new CustomHashMap();
            boolean isUnique = true;

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                if (isUnique) {
                    // Try inserting into custom map
                    if (!map.insert(val)) {
                        isUnique = false; // Found a duplicate
                    }
                }
            }

            if (isUnique) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}