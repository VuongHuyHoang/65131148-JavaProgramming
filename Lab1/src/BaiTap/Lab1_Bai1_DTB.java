/**
 * 
 */
package BaiTap;
import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		float DTB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mời nhập họ và tên sinh viên: ");
		hoTen = sc.nextLine();
		
		do
		{
			System.out.print("Mời nhập điểm trung bình của sinh viên: ");
			DTB = sc.nextFloat();
		}while(DTB<0||DTB>10);
		
		System.out.println("Họ tên sinh viên: "+hoTen);
		System.out.println("Điểm trung bình của sinh viên: "+DTB);
	}

}
