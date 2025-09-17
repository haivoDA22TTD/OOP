public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Kết quả:" +c);
        }catch (ArithmeticException ex){
            System.out.println("Lỗi không thể chia cho 0");
        }
        System.out.println("Chương trình tiếp tục chạy");
    }
}
