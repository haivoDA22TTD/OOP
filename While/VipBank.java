import java.time.LocalDate;


public class VipBank extends Bank {
    private Double debt = 0.0;
    private LocalDate debtDate = null;

    @Override
    public void drawMoney(Double money) {
        if(money <= 0) {
            System.out.println("Amount must be greater than 0");
        }else if (money <= getBalance()){
            System.out.println("VIP draw: " + money);
            setBalance(getBalance() - money);
        }else{
            Double overdraft = money - getBalance();
            setBalance(0.0);
            debt += overdraft;
            debtDate = LocalDate.now();
            System.out.println("You have overdrawn: " + overdraft + " - Must pay in 30 days.");
        }
    }
    public void checkDebt() {
        if (debt > 0 && debtDate != null) {
            LocalDate now = LocalDate.now();
            if (debtDate.plusDays(30).isBefore(now)) {
                System.out.println("⚠️ Your debt is overdue! Amount: " + debt);
            } else {
                System.out.println("You have debt: " + debt + " - Pay before: " + debtDate.plusDays(30));
            }
        } else {
            System.out.println("✅ No debt.");
        }
    }
    public void payDebt(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (debt == 0) {
            System.out.println("No debt to pay.");
            return;
        }

        if (amount >= debt) {
            double leftover = amount - debt;
            System.out.println("✅ Debt paid off. Remaining: " + leftover + " added to balance.");
            debt = 0.0;
            debtDate = null;
            setBalance(getBalance() + leftover);
        } else {
            debt -= amount;
            System.out.println("Partial payment. Remaining debt: " + debt);
        }
    }
    public double getDebt() {
        return debt;
    }
}

