import java.util.Scanner;

public class So_Nguyen_Lon_Nhat{	
		public static void main(String[]args){
			//Addtribute
				int a, b, c, d;

			//Input
				Scanner ip = new Scanner(System.in);
				System.out.println("Nhập vào số nguyên dương thứ nhất:");
				a = ip.nextInt();
				System.out.println("Nhập vào số nguyên dương thứ hai:");
				b = ip.nextInt();
				System.out.println("Nhập vào số nguyên dương thứ ba:");
				c = ip.nextInt();
				System.out.println("Nhập vào số nguyên dương thứ tư:");
				d = ip.nextInt();

			//Check conditional
				while (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
					System.out.println("Số nhập vào phải lớn hơn 0");
					System.out.println("Nhập vào số nguyên dương thứ nhất:");
					a = ip.nextInt();
					System.out.println("Nhập vào số nguyên dương thứ hai:");
					b = ip.nextInt();
					System.out.println("Nhập vào số nguyên dương thứ ba:");
					c = ip.nextInt();
					System.out.println("Nhập vào số nguyên dương thứ tư:");
					d = ip.nextInt();
				}

			//Check number maximum
				int max = Math.max(Math.max(a, b), Math.max(c, d));

			//Output
				System.out.println("Số nguyên lớn nhất là:" + max);

		}
}