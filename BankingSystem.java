import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    private final double dailyWithdrawalLimit = 1000.0;
    private double dailyWithdrawalAmount;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.dailyWithdrawalAmount = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    boolean withdraw(double amount) {
        if (amount <= balance && (dailyWithdrawalAmount + amount) <= dailyWithdrawalLimit) {
            balance -= amount;
            dailyWithdrawalAmount += amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }
        System.out.println("Withdrawal failed: Insufficient funds or daily limit exceeded.");
        return false;
    }

    double checkBalance() {
        return balance;
    }

    void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Display Account Info\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Balance: " + account.checkBalance());
                    break;

                case 4:
                    account.displayAccountInfo();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
