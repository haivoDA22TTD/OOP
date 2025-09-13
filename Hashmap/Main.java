import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Map<String, Account> accounts = new HashMap<>();

        // Create account default
        Bank b1 = new Bank();
        b1.setBalance(1000.0);
        VipBank b2 = new VipBank();
        b2.setBalance(500.0);
        Bank b3 = new Bank();
        b3.setBalance(300.0);

        accounts.put("user1", new Account("user1", "pass1", b1));
        accounts.put("user2", new Account("user2", "pass2", b2));
        accounts.put("user3", new Account("user3", "pass3", b3));

        while (true) {
            System.out.println("\n=== Login ===");
            System.out.print("Username: ");
            String username = ip.nextLine();

            Account acc = accounts.get(username);
            if (acc == null) {
                System.out.println("❌ Account not found!");
                continue;
            }

            if (acc.isLocked()) {
                System.out.println("🔒 This account is temporarily locked. Please contact support.");
                continue;
            }

            System.out.print("Password: ");
            String password = ip.nextLine();

            if (!acc.getPassword().equals(password)) {
                System.out.println("❌ Incorrect password!");
                continue;
            }

            System.out.println("✅ Login successful. Welcome, " + username + "!");
            Bank bank = acc.getBank();

            while (true) {
                System.out.println("\n------ Menu ------");
                System.out.println("1. View balance");
                System.out.println("2. Draw money");
                System.out.println("3. Load money");
                System.out.println("4. Transfer money");
                if (bank instanceof VipBank) {
                    System.out.println("5. Check debt");
                    System.out.println("6. Pay debt");
                    System.out.println("7. Lock/Unlock my account");
                    System.out.println("8. Logout");
                } else {
                    System.out.println("5. Lock/Unlock my account");
                    System.out.println("6. Logout");
                }

                System.out.print("Enter your choice: ");
                int choice = ip.nextInt();

                if (bank instanceof VipBank) {
                    VipBank vip = (VipBank) bank;
                    switch (choice) {
                        case 1:
                            vip.showMoney();
                            break;
                        case 2:
                            System.out.print("Enter amount to draw: ");
                            vip.drawMoney(ip.nextDouble());
                            break;
                        case 3:
                            System.out.print("Enter amount to load: ");
                            vip.loadBalance(ip.nextDouble());
                            break;
                        case 4:
                            ip.nextLine(); // clear buffer
                            System.out.print("Enter recipient username: ");
                            String recipient = ip.nextLine();
                            Account recipientAcc = accounts.get(recipient);
                            if (recipientAcc == null) {
                                System.out.println("❌ Recipient not found!");
                            } else if (recipientAcc.isLocked()) {
                                System.out.println("❌ Recipient account is locked. Cannot transfer money.");
                            } else {
                                System.out.print("Enter amount to transfer: ");
                                double amount = ip.nextDouble();
                                vip.transferMoney(recipientAcc.getBank(), amount);
                            }
                            break;
                        case 5:
                            vip.checkDebt();
                            break;
                        case 6:
                            System.out.print("Enter amount to pay debt: ");
                            vip.payDebt(ip.nextDouble());
                            break;
                        case 7:
                            ip.nextLine(); // clear buffer
                            if (acc.isLocked()) {
                                acc.setLocked(false);
                                System.out.println("✅ Your account has been unlocked.");
                            } else {
                                acc.setLocked(true);
                                System.out.println("🔒 Your account has been locked.");
                                System.out.println("⚠️ You will be logged out.");
                                choice = 8;
                            }
                            break;
                        case 8:
                            ip.nextLine(); // clear buffer
                            System.out.println("🔁 Logging out...");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    if (choice == 8) break;
                } else {
                    switch (choice) {
                        case 1:
                            bank.showMoney();
                            break;
                        case 2:
                            System.out.print("Enter amount to draw: ");
                            bank.drawMoney(ip.nextDouble());
                            break;
                        case 3:
                            System.out.print("Enter amount to load: ");
                            bank.loadBalance(ip.nextDouble());
                            break;
                        case 4:
                            ip.nextLine(); // clear buffer
                            System.out.print("Enter recipient username: ");
                            String recipient = ip.nextLine();
                            Account recipientAcc = accounts.get(recipient);
                            if (recipientAcc == null) {
                                System.out.println("❌ Recipient not found!");
                            } else if (recipientAcc.isLocked()) {
                                System.out.println("❌ Recipient account is locked. Cannot transfer money.");
                            } else {
                                System.out.print("Enter amount to transfer: ");
                                double amount = ip.nextDouble();
                                bank.transferMoney(recipientAcc.getBank(), amount);
                            }
                            break;
                        case 5:
                            ip.nextLine(); // clear buffer
                            if (acc.isLocked()) {
                                acc.setLocked(false);
                                System.out.println("✅ Your account has been unlocked.");
                            } else {
                                acc.setLocked(true);
                                System.out.println("🔒 Your account has been locked.");
                                System.out.println("⚠️ You will be logged out.");
                                choice = 6;
                            }
                            break;
                        case 6:
                            ip.nextLine(); // clear buffer
                            System.out.println("🔁 Logging out...");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    if (choice == 6) break;
                }
            }
        }
    }
}
