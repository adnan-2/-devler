package odev03;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ
		 * harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda
		 * yazdirin. ferhat => Ferhat kirac => Kirac
		 */

		Scanner scan = new Scanner (System.in);
		String firstName,lastName;
		System.out.println("isim ve soyisiminizi giriniz:");
		firstName= scan.next();
		lastName=scan.next();
		
		firstName=firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		lastName =lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		System.out.println("Ad-Soyad : " +firstName+" "+lastName );

		scan.close();
	}

}
