package Odev;

import java.util.Scanner;

public class Soru17 {

	public static void main(String[] args) {
		/*
		 * Soru 18 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin
		 * girdigi String'in palindrome olup olmadigini kontrol eden bir program yazin.
		 * (Palindrome Nedir?)
		 
		 */
		 // String sýnýfýnýn nesneleri
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Lutfen bir string giriniz");
		String str = scan.nextLine().replace(" " ,"").toLowerCase();
		
	  
	    String  tersi = "";

	    for (int i = str.length()-1; i >= 0; i--)
	      tersi+= str.charAt(i);  

	    if (str.equals(tersi))
	      System.out.println("Palindrom.");
	    else
	      System.out.println("Palindrom deðil.");
		
	
	}
   
}
