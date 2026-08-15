class InvalidStudentIDException extends Exception {
    public InvalidStudentIDException(String message) {
        super(message);
    }
}

class Student {
    private String studentID;

    public Student(String studentID) throws InvalidStudentIDException {
        if (!isValidStudentID(studentID)) {
            throw new InvalidStudentIDException("Invalid Student ID format.  Must be ABC-1234");
        }
        this.studentID = studentID;
    }

    private boolean isValidStudentID(String studentID) {
        return studentID.matches("[A-Z]{3}-\\d{4}");
    }

    public String getStudentID() {
        return studentID;
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("ABC-1234");
            System.out.println("Student 1 ID: " + student1.getStudentID());

            Student student2 = new Student("123-ABCD"); // Invalid format
        } catch (InvalidStudentIDException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}