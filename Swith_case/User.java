import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    Double deposit = sc.nextDouble();
                    bank.loadMoney(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    Double withdraw = sc.nextDouble();
                    bank.drawMoney(withdraw);
                    break;
                case 3:
                    bank.showBalance();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
