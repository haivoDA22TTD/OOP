import java.util.Scanner;

public class Nhan_Vien{
	
	//Addtribute
	String msnv;
	String hoTen;
	Float luong;

	//Contructor
	public Nhan_Vien(String msnv, String hoTen, Float luong){
		this.msnv = msnv;
		this.hoTen = hoTen;
		this.luong = luong;
	}

	//Value default

	public Nhan_Vien(){
		this.msnv = msnv;
		this.hoTen = hoTen;
		this.luong = luong;
	}

	//Setter & Getter

	public void setmsnv(String msnv){
		this.msnv = msnv;
	}

	public String getmsnv(){
		return msnv;
	}

	public void sethoTen(String hoTen){
		this.hoTen = hoTen;
	}

	public String gethoTen(){
		return hoTen;
	}

	public void setluong(Float luong){
		this.luong = luong;
	}

	public Float getluong(){
		return luong;
	}

	//Method input
	public void nhap(){
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập mã số nhân viên:");
		msnv = ip.nextLine();
		System.out.println("Nhập họ tên nhân viên:");
		hoTen = ip.nextLine();
		System.out.println("Nhập số lương:");
		luong = ip.nextFloat();
	}

	//Method putput

	public void xuat(){
		System.out.println("Mã số nhân viên:" +msnv);
		System.out.println("Họ tên nhân viên:" +hoTen);
		System.out.println("Lương:" +luong);
	}
}