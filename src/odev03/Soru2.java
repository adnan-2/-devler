package odev03;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Isted�g�n�z ay� rakamla giriniz");

		String ay = scan.next();

		switch (ay) {

		case "1":
			System.out.println("ocak 31 gun");
			break;
		case "2":
			System.out.println("Subat 28 gun");
			break;
		case "3":
			System.out.println("Mart 31 gun");
			break;
		case "4":
			System.out.println("Nisan 30 gun");
			break;
		case "5":
			System.out.println("May�s 31 gun");
			break;
		case "6":
			System.out.println("Haz�ran 30 gun");
			break;
		case "7":
			System.out.println("Temmuz 31 gun");
			break;
		case "8":
			System.out.println("A�ustos 31 gun");
			break;
		case "9":
			System.out.println("Eyl�l 30 gun");
			break;
		case "10":
			System.out.println("Ekim 31 gun");
			break;
		case "11":
			System.out.println("Kas�m 30 gun");
			break;
		case "12":
			System.out.println("Aral�k 31 gun");
			break;
		default:
			System.out.println("Yanl� girdiniz, lutfen tekrar giriniz");

		}
	}

}
