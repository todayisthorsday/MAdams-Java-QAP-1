public class Account {
    // Private instance variables
    private String id;
    private String name;
    private int balance;

    // Constructor with id and name (balance defaults to 0)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for id
    public String getID() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Method to credit $amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Method to debit $amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount has exceeded balance.");
        }
        return balance;
    }

    // Method for transfering $amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount has exceeded balance.");
        }
        return balance;
    }

    // Method to return string for the account
    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}