import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = ip.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = ip.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = ip.nextInt();

        if (kiemTraTamGiac(a, b, c)) {
            System.out.println("Ba cạnh này tạo thành một tam giác.");

            if (kiemTraTamGiacDeu(a, b, c)) {
                System.out.println("=> Đây là tam giác đều.");
            } else if (kiemTraTamGiacVuong(a, b, c) && kiemTraTamGiacCan(a, b, c)) {
                System.out.println("=> Đây là tam giác vuông cân.");
            } else if (kiemTraTamGiacVuong(a, b, c)) {
                System.out.println("=> Đây là tam giác vuông.");
            } else if (kiemTraTamGiacCan(a, b, c)) {
                System.out.println("=> Đây là tam giác cân.");
            } else {
                System.out.println("=> Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh này KHÔNG tạo thành một tam giác.");
        }

        ip.close();
    }

    public static boolean kiemTraTamGiac(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    public static boolean kiemTraTamGiacDeu(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean kiemTraTamGiacCan(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    public static boolean kiemTraTamGiacVuong(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2;
    }
}
