
class BankAccount {
    // Private data member
    private double banlance;

    // ConStructor
    public BankAccount(double initialBalance) {
        banlance = initialBalance;
    }

    // Getter method
    public double getBalance() {
        return banlance;
    }

    // Setter Method
    public void deposit(double amount) {
        if (amount > 0) {
            banlance += amount;
        }
    }

    // one More Setter
    public void withDraw(double amount) {
        if (amount > 0 && amount <= banlance) {
            banlance -= amount;
        } else {
            System.out.println("Not sufficent balance");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount newaccount = new BankAccount(5000.0);

        // Accessing balance via getter
        System.out.println("Initial Balance: " + newaccount.getBalance());

        // Modifying balance via setter
        newaccount.deposit(1500);
        System.out.println("Updated Balance after deposite: " + newaccount.getBalance());

        // Modifying balance via setter (WithDraw)
        newaccount.withDraw(4000);
        System.out.println("Updated after Balance WithDraw: " + newaccount.getBalance());

    }
}
