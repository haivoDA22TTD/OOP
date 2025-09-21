public class Main {

    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println("Chu vi:" + retangle.cv());
        System.out.println("Diện tích:" + retangle.dt());
        System.out.println("Đường chéo:" + retangle.dc());
        System.out.println("Hình chữ nhật");
        retangle.draw();
    }
}
