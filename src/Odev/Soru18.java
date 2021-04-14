package Odev;

import java.util.Scanner;

public class Soru18 {

	public static void main(String[] args) {
		/*
		 * Soru 17 ) Interview Question Kullanicidan bir String isteyin 
		 * ve Stringi tersine ceviren bir program yazin.
		 */

		Scanner scan  = new Scanner(System.in);
		System.out.println("Lutfen cevirmek istediðiniz bir yazý giriniz");
		
		String yazi= scan.nextLine();
		
		String tersi="" ;
		for (int i = yazi.length()-1; i >=0; i--) {
			tersi+=yazi.charAt(i);
			
			 
		}
		System.out.print("Girdiðiniz yazýnýn tersi :  " + tersi);
		
		System.out.println("");
		
		
		// 2.yol
		/* System.out.println("Lutfen cevirmek istediðiniz bir yazý giriniz");
		 for (int i = yazi.length()-1; i >=0; i--) {
			 System.out.print(yazi.charAt(i));
			
		}
		
		 scan.close();
	*/}
 
}
