abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
    // Abstract method to calculate Interest
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 4%

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        // No interest for checking accounts
        return 0.0;
    }
}

class Codechef {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 4.0);
        CheckingAccount checking = new CheckingAccount("CA456", 1500.0);

        savings.deposit(200);      // +200 to savings
        checking.withdraw(300);    // -300 from checking

        System.out.println("Interest from Savings Account: $" + savings.calculateInterest());
    }
}