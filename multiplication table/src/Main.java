//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương");
        for(int i = 1; i<= 9; i++ ){
            for(int j = 1; j <= 10; j++ ){

                System.out.printf(" %d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}