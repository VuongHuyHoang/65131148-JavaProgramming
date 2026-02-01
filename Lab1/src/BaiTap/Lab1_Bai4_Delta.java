/**
 * 
 */
package BaiTap;
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai4_Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		float delta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mời nhập giá trị của 3 cạnh a,b,c: ");
		do
		{
			System.out.print("a = ");
			a = sc.nextFloat();
			if(a<=0)
				System.out.println("Mời nhập giá trị lớn hơn 0");
		}while(a<=0);
		
		do
		{
			System.out.print("b = ");
			b = sc.nextFloat();
			if(b<=0)
				System.out.println("Mời nhập giá trị lớn hơn 0");
		}while(b<=0);
		
		do
		{
			System.out.print("c = ");
			c = sc.nextFloat();
			if(c<=0)
				System.out.println("Mời nhập giá trị lớn hơn 0");
		}while(c<=0);

		
		delta = b*b-4*a*c;
		System.out.println("Giá trị delta = "+delta);
		if(delta>0)
			System.out.println("Giá trị căn bậc 2 của delta = "+ Math.sqrt(delta));
	}

}
