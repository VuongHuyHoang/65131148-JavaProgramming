/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
public class Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float canh,theTich;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập giá trị cạnh của khối lập phương: ");
		canh = sc.nextFloat();
		theTich = canh*canh*canh;
		System.out.println("Thể tích của khối lập phương = "+theTich);
		
	}

}
