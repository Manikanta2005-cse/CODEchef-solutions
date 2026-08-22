import java.util.ArrayList;

 class TodoList {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store to-do items
        ArrayList<String> todoList = new ArrayList<>();

        // 2. Add initial to-do items
        todoList.add("Grocery Shopping");
        todoList.add("Laundry");
        todoList.add("Pay Bills");

        // 3. Print the to-do list with index numbers
        System.out.println("To-Do List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + ": " + todoList.get(i));
        }

        // 4. Remove the to-do item at index 1 ("Laundry")
        todoList.remove(1);

        // 5. Print the updated to-do list with index numbers
        System.out.println("Updated To-Do List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + ": " + todoList.get(i));
        }
    }
}