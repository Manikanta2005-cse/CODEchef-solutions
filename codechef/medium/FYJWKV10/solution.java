// Create custom exception class WeakPasswordException here 
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message){
        super(message);
    }
}




public class Main {
    public static void main(String[] args) {
        String password = "12345";

        try {
            if (password.length() < 6) {
                throw new WeakPasswordException("Password is too short. Minimum 6 characters required.");
            }
            System.out.println("Password accepted.");
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
