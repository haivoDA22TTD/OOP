
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        this(10, 20);
    }

    public void setLength(int length) {
        if (length <= 0 || length > 20)  {
            throw new IllegalArgumentException("Length must be between 1 and 20");
        }
        this.length = length;
    }

    public void setWidth(int width) {
        if (width <= 0 || width > 20) {
            throw new IllegalArgumentException("Width must be between 1 and 20");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public int acreage() {
        return length * width;
    }

    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

    public boolean isSquare() {
        return length == width;
    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
