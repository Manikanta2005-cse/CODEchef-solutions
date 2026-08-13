# CYMZCY09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Document Viewer

In this practice problem, you will apply abstraction using abstract classes and methods in Java. You are provided with an abstract class `Document` and two concrete subclasses: `WordDocument` and `PDFDocument`.

 **Task** 
Complete the missing lines in the code to:

- Declare the Document class as abstract using the abstract keyword.
- Declare an abstract method open() inside the Document class.
- Use the super keyword in the constructors of WordDocument and PDFDocument to call the constructor of the parent class Document.

 **Expected Output:** 

```
Opening Word document: ProjectProposal.docx  
Opening PDF document: Report.pdf

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:29:31.595Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/CYMZCY09)