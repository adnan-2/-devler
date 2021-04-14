package hausaufgaben1;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

/*Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. 
 * Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
	1 seker= 1.7 gr
	Ornek: Input ⇒      
	Cay : 10
	Seker :2
	Output : 12.41 kg/yil
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen gunde kac cay ictiginizi yazınız : ");
	  int cay = scan.nextInt();
	  System.out.println("Cayı kac sekerli ictiginizi zayınız");
	  double seker = scan.nextDouble();
	  int yılCay= cay*365;
	  double yılSeker = seker*yılCay*1.7;
	  System.out.println("Toplam seker = "+(yılSeker/1000));
	  
		
		

		
		scan.close();
		
		
	}

}
