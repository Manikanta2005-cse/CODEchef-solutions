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