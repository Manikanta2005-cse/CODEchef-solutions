# MIBIIW09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:06:47.340Z  

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

[View on CodeChef](https://www.codechef.com/problems/MIBIIW09)