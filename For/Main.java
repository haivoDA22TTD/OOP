public class Main {

    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println("Perimeter:" + retangle.perimeter());
        System.out.println("Acreage:" + retangle.acreage());
        System.out.println("Diagonal:" + retangle.diagonal());
        retangle.isSquare();
        retangle.draw();
    }
}
