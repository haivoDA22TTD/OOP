public class Retangle {
   private int length;
   private int width;

   public Retangle(int length, int width) {
       setLength(length);
       setWidth(width);
   }

   public Retangle() {
       this.length = 15;
       this.width = 25;
   }

   public void setLength(int length) {
       if (length <= 0 || length > 20) {
        System.out.println("Length must be between 1 and 20");
       }
       this.length = length;
   }

   public void setWidth(int width) {
       if (width <= 0 || width > 20) {
           System.out.println("Width must be between 1 and 20");
       }
       this.width = width;
   }

   public int getLength() {
       return length;
   }

   public int getWidth() {
       return width;
   }

   public int perimeter(){
       return (length + width) *2;
   }

   public int acreage(){
       return length * width;
   }

   public double diagonal(){
       return Math.sqrt(length * length + width * width);
   }

   public boolean isSquare(){
        return  (length == width);
   }

   public void draw(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
   }
}
