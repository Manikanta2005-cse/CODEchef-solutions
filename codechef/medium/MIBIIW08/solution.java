interface Notifier {
    void sendNotification(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class Codechef {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();

        email.sendNotification("Your order has been shipped");
        sms.sendNotification("Your OTP is 456789");
    }
}