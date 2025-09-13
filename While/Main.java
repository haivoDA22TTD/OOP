import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Are you a VIP customer? (y/n): ");
        String isVip = ip.nextLine();

        Bank bank;
        if (isVip.equalsIgnoreCase("y")) {
            bank = new VipBank();
        } else {
            bank = new Bank();
        }

        while (true) {
            System.out.println("\n------Menu------ ");
            System.out.println("1. View balance");
            System.out.println("2. Draw money");
            System.out.println("3. Load money");
            if (bank instanceof VipBank) {
                System.out.println("4. Check debt");
                System.out.println("5. Pay debt");
                System.out.println("6. Exit");
            } else {
                System.out.println("4. Exit");
            }

            System.out.println("Enter your choice: ");
            int choice = ip.nextInt();

            if (bank instanceof VipBank) {
                VipBank vip = (VipBank) bank;
                switch (choice) {
                    case 1:
                        vip.showMoney();
                        break;
                    case 2:
                        System.out.println("Enter money to draw:");
                        vip.drawMoney(ip.nextDouble());
                        break;
                    case 3:
                        System.out.println("Enter money to load:");
                        vip.loadBalance(ip.nextDouble());
                        break;
                    case 4:
                        vip.checkDebt();
                        break;
                    case 5:
                        System.out.println("Enter amount to pay debt:");
                        vip.payDebt(ip.nextDouble());
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                switch (choice) {
                    case 1:
                        bank.showMoney();
                        break;
                    case 2:
                        System.out.println("Enter money to draw:");
                        bank.drawMoney(ip.nextDouble());
                        break;
                    case 3:
                        System.out.println("Enter money to load:");
                        bank.loadBalance(ip.nextDouble());
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
