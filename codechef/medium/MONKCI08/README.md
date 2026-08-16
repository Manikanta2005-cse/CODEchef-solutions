# MONKCI08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Managing a To-Do List

In this example, we are going to demonstrate the usage of the remove method by both index and value, which allows removing elements either by their position or by their content in the list.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:06:11.574Z  

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        
        // Adding initial tasks
        todoList.add("Buy groceries");
        todoList.add("Do laundry");
        todoList.add("Pay bills");
        todoList.add("Call mom");
        todoList.add("Walk dog");
        
        System.out.println("Original list: " + todoList);
        
        // Remove task at index 2 ("Pay bills")
        todoList.remove(2);
        System.out.println("After removing index 2: " + todoList);
        
        // Remove "Call mom" by object
        todoList.remove("Call mom");
        System.out.println("Final to-do list: " + todoList);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI08)