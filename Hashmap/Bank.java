import java.util.Scanner;

public class Bank {
    //Addtribute
    private Double balance = 0.0;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //Method load money
    public void loadBalance(Double money) {

        //Check conditional
        if (money <= 0) {
            System.out.print("Number money be load to account must bigger than zero :" + money);
            return;
        } else {
            System.out.print("Number money has been successfully loaded:" + money);
            //logic loadMoney
            balance += money;
        }
    }

    //Method draw money
    public void drawMoney(Double money) {

        if (money <= 0) {
            System.out.println("Number money be draw must bigger than zero:" + money);
        } else if (money > balance) {
            System.out.println("Money be draw bigger than balance:" + money);
        } else {
            System.out.println("Money has been successfully draw:" + money);
            //logic drawMoney
            balance -= money;
        }
    }

    //Method show balance
    public void showMoney() {
        System.out.println("Balance present:" + balance);
    }

    // Transfer money to another account
    public boolean transferMoney(Bank toAccount, double amount) {
        if (amount <= 0) {
            System.out.println("❌ Amount must be greater than zero.");
            return false;
        }
        if (amount > this.getBalance()) {
            System.out.println("❌ Not enough balance to transfer.");
            return false;
        }
        this.setBalance(this.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        System.out.println("✅ Transferred " + amount + " successfully.");
        return true;
    }
}