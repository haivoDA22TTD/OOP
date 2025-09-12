public class Bank {

    private Double balance = 0.0;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Deposit money
    public void loadMoney(Double money) {
        if (money == null || money <= 0) {
            System.out.println("Amount to deposit must be greater than 0.");
            return;
        }
        balance += money;
        System.out.println("Deposit successful: " + money);
    }

    // Withdraw money
    public void drawMoney(Double money) {
        if (money == null || money <= 0) {
            System.out.println("Amount to withdraw must be greater than 0.");
        } else if (money > balance) {
            System.out.println("Withdrawal amount exceeds current balance.");
        } else {
            balance -= money;
            System.out.println("Withdrawal successful: " + money);
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}
