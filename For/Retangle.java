public class Retangle {
    private int length;
    private int width;

    public Retangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }
    public Retangle() {
        this.length = 10;
        this.width = 20;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if (length <= 0 || length > 20) {
            throw  new IllegalArgumentException("Length must be between 1 and 20");
        }
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if (width <= 0 || width > 20) {
            throw  new IllegalArgumentException("Width must be between 1 and 20");
        }
        this.width = width;
    }

    public int cv(){
        return 2* (length + width) ;
    }
    public int dt(){
        return length * width;
    }
    public double dc (){
        return Math.sqrt(length * length + width * width);
    }
    public boolean hv(){
         return length == width;
    }
    public void draw(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
