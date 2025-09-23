public class Main {

    public static void main(String[] args) {
        Rectangle retangle = new Rectangle();
        System.out.println("Perimeter : " + retangle.perimeter());
        System.out.println("Acreage: " + retangle.acreage());
        System.out.println("Diagonal: " + retangle.diagonal());
        System.out.println("Retangle:");
        retangle.draw();
    }
}
