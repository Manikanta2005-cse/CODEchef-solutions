# CYMZCY10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

What will be the output of the following Java program?

```
abstract class A {
    public void x() {}
    public abstract void y();
    public abstract void z();
}

abstract class B extends A {
    public void y() {}
}

class Codechef {
    public static void main(String[] args) {
        B ref = new B();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:30:02.990Z  

```cpp
abstract class Document {
    String title;

    public Document(String title) {
        this.title = title;
    }

    // Abstract method to be implemented by subclasses
    public abstract void open();
}

class WordDocument extends Document {
    public WordDocument(String title) {
        super(title);
    }

    @Override
    public void open() {
        System.out.println("Opening Word document: " + title);
    }
}

class PDFDocument extends Document {
    public PDFDocument(String title) {
        super(title);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document: " + title);
    }
}

class Codechef {
    public static void main(String[] args) {
        WordDocument wordDoc = new WordDocument("ProjectProposal.docx");
        PDFDocument pdfDoc = new PDFDocument("Report.pdf");

        wordDoc.open();
        pdfDoc.open();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CYMZCY10)