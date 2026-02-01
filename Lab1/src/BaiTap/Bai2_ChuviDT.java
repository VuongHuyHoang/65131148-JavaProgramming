/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
public class Bai2_ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chieuDai,chieuRong;
		float chuVi,dienTich,canhNho;
		
		Scanner sc  = new Scanner(System.in);
		do
		{
			System.out.print("Mời nhập chiều dài: ");
			chieuDai = sc.nextFloat();
			if(chieuDai<=0)
				System.out.println("Mời nhập giá trị >0");
		}while(chieuDai<=0);
		
		do
		{
			System.out.print("Mời nhập chiều rộng: ");
			chieuRong = sc.nextFloat();
			if(chieuRong<=0)
				System.out.println("Mời nhập giá trị >0");
		}while(chieuRong<=0);
		
		chuVi = (chieuDai+chieuRong)*2;
		dienTich = chieuDai*chieuRong;
		if(chieuDai>chieuRong)
			canhNho = chieuRong;
		else
			canhNho = chieuDai;
		
		System.out.println("Chu vi của hình chữ nhật = "+chuVi);
		System.out.println("Diện tích của hình chữ nhật = "+dienTich);
		System.out.println("Cạnh nhỏ của hình chữ nhật = "+canhNho);
	}

}
