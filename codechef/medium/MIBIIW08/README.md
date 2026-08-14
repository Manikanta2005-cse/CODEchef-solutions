# MIBIIW08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Notification System
- In this example, we demonstrate how interfaces in Java can be used to define a common behavior that multiple classes can implement in their own way. An interface defines what should be done, but the implementing classes decide how it is done.
- We define an interface Notifier with a method sendNotification(String message). Two classes - EmailNotifier and SMSNotifier - implement this interface. Each class provides its own version of the sendNotification() method, simulating how messages might be sent through email or SMS.
- This structure provides flexibility and abstraction: the code calling sendNotification() doesn't need to know how the message is sent - only that it will be sent.

 **When executed, the code will show:** 

```
Sending Email: Your order has been shipped
Sending SMS: Your OTP is 456789

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:06:42.284Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW08)