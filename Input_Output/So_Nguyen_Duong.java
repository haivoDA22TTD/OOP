import java.util.Scanner;

public class So_Nguyen_Duong{

		public static void main(String[]args){
			//Addtribute
				int x;

			//input
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên dương:");
		x = ip.nextInt();
	
			//Check conditional
		while(x <= 0){
			System.out.println("Bạn phải nhập vào số nguyên dương");
			System.out.println("Nhập vào một số nguyên dương:");
			x = ip.nextInt();
		}
			
		if(x %2 == 0){
			System.out.println(" Số nhập vào phải chẵn:" + x);
		}else{
			System.out.println("Số nhập vào lẻ:" + x);
		}
	}
}
