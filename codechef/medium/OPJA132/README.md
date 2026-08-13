# OPJA132

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Text Formatting

You are provided with a Java code snippet that includes an interface `TextFormatter` and two formatter classes, `UpperCaseFormatter` and `ReverseFormatter`. Your task is to complete the implementation of the `UpperCaseFormatter` and `ReverseFormatter` classes to ensure they format the text as expected.

- UpperCaseFormatter The UpperCaseFormatter class is responsible for converting the input text to uppercase. You need to implement the format method in this class so that it transforms the input text into uppercase characters.
- ReverseFormatter The ReverseFormatter class should reverse the input text. You need to implement the format method in this class using the StringBuilder or any other appropriate technique to achieve the desired text reversal.

Once you have completed the implementations of both formatter classes, you can test them by running the code provided in the `Codechef` class's `main` method.

 **Note** : Do not modify the `TextFormatter` interface or the existing code structure. Your task is solely to complete the two formatter classes.

This problem allows users to practice implementing specific functionality within classes that adhere to a provided interface.

### Sample 1:
Input
Output

```
 
```

```
CODECHEF
fehcedoC
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:14:47.269Z  

```java
interface TextFormatter {
    String format(String text);
}

class UpperCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

class ReverseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

class Codechef {
    public static void main(String[] args) {
        String text = "Codechef";

        // Format the text using UpperCaseFormatter
        TextFormatter formatter = new UpperCaseFormatter();
        System.out.println(formatter.format(text));

        // Format the text using ReverseFormatter
        formatter = new ReverseFormatter();
        System.out.println(formatter.format(text));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA132)