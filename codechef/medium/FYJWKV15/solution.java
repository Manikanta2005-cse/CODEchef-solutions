class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class Employee {
    private String employeeId;

    public Employee(String employeeId) throws InvalidEmployeeIdException {
        if (!employeeId.matches("EMP-\\d{4}")) {
            throw new InvalidEmployeeIdException("Invalid Employee ID format. Must be EMP-NNNN");
        }
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("EMP-1234");
            System.out.println("Employee 1 ID: " + employee1.getEmployeeId());

            Employee employee2 = new Employee("EMP-ABCD"); // Invalid format
        } catch (InvalidEmployeeIdException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}