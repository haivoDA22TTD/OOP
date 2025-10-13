import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = ip.nextInt();

        if(ispreme(number)){
            System.out.println("The number is preme number:" +number);
        }else {
            System.out.println("The number is not preme number:" +number);
        }
    }

    public static boolean ispreme(int number) {
        if (number <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}