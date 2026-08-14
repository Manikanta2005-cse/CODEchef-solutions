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