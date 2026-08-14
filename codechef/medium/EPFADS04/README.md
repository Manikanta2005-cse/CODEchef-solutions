# EPFADS04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multi-functional Printer
- In this problem, we explore how multiple interfaces in Java can be implemented by a single class to model a real-world multi-functional device. Imagine a printer that can not only print but also scan documents. To represent these capabilities separately and cleanly, we use interfaces.
- You are given two interfaces: Printer, which declares a method printDocument() Scanner, which declares a method scanDocument()

 **Task** 

- Define both interfaces with their respective method declarations.
- Provide concrete implementations for the printDocument() and scanDocument() methods in the MultiFunctionalPrinter class. Inside the class, override the following methods: printDocument() → print: Printing document... scanDocument() → print: Scanning document...
- In the main() method: Call both printDocument() and scanDocument() methods on the object.

 **Expected Output:** 

```
Printing document...
Scanning document...

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:21:16.304Z  

```java
interface Printer {
    // Declare the printDocument() method here
    void printDocument();
}

interface Scanner {
    // Declare the scanDocument() method here
    void scanDocument();
}

// Create the MultiFunctionalPrinter class here that implements both interfaces
class MultiFunctionalPrinter implements Printer, Scanner {
    public void printDocument() {
        System.out.println("Printing document...");
    }
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}




class Codechef {
    public static void main(String[] args) {
        // Create an instance of MultiFunctionalPrinter
        MultiFunctionalPrinter printer =new MultiFunctionalPrinter();

        // Call the printDocument() and scanDocument() methods
        printer.printDocument();
        printer.scanDocument();
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EPFADS04)