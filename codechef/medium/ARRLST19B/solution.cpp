import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        
        // Initialize an ArrayList with department capacities
        ArrayList<Integer> departmentCapacities = new ArrayList<>();
        departmentCapacities.add(10); // Department 1
        departmentCapacities.add(15); // Department 2
        departmentCapacities.add(8);  // Department 3
        departmentCapacities.add(20); // Department 4

        // Use the size() method to print the total number of departments
        System.out.println("Number of Departments: " + departmentCapacities.size());

        // Display individual department capacities without a loop
        System.out.println("Capacity of Department 1: " + departmentCapacities.get(0));
        System.out.println("Capacity of Department 2: " + departmentCapacities.get(1));
        System.out.println("Capacity of Department 3: " + departmentCapacities.get(2));
        System.out.println("Capacity of Department 4: " + departmentCapacities.get(3));
    }
}
