package odev03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		/*
		StringMethods:
			Çift uzunlukta bir degiskenin ilk yarýsýný konsolda yazdirmak için bir Java programý yazýniz.
	    	     ORNEK:
		     	INPUT      :  Python
			OUTPUT :   Pyt
	    */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen istediginiz degiskeni giriniz");
		String degisken= scan.nextLine();
		int karakterSayisi= degisken.length();
		int ort=karakterSayisi/2;
		
		if (karakterSayisi%2==0) {
			System.out.println(degisken.substring(0,ort));
		} else {

			System.out.println("Lutfen cift uzunlukta bir degisken giriniz");
		}
		
		
		
		
	}
}
