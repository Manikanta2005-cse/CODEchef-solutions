class CodeChef {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        double average = (num1 + num2 + num3) / 3;  // Logical error: Wrong precedence

        System.out.println("The calculated average is: " + average); // it will print 40.0, which is wrong
    }
}