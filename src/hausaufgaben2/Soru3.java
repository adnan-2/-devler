package hausaufgaben2;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		�NestedIfStatements� class olusturun.
		
	Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		
	Y�l�, ayi ve g�n� tamsay� olarak al�n e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
	Examples:
		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
		int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
		Yusuf is Older            
	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci kisinin dogum y�l�n� g�r�n�z");
		int yil1=scan.nextInt();
		System.out.println("�kinci kisinin dogum y�l�n� g�r�n�z");
		int yil2= scan.nextInt();
	
		if (yil1>yil2) {
			System.out.println("Birinci kisinin yas� kucuk");
		} else if (yil1<yil2) {
			System.out.println("�kinci kisinin yas� kucuk");
		} else {

			System.out.println("Birinci kisinin dogum ayin� giriniz");
			int ay1=scan.nextInt();
			System.out.println("�kinci kisinin dogum ayin� giriniz");
			int ay2=scan.nextInt();
			if (ay1>ay2) {
				System.out.println("Birinci kisinin yas� kucuk");
			} else if (ay1<ay2) {
				System.out.println("�kinci kisinin yas� kucuk");
			} else {

				System.out.println("Birinci kisinin dogum gununu giriniz");
				int gun1= scan.nextInt();
				System.out.println("Birinci kisinin dogum gununu giriniz");
				int gun2= scan.nextInt();
				if (gun1>gun2) {
					System.out.println("�kinci kisi buyuk");
				} else if (gun1<gun2) {
					System.out.println("Birinci kisi buyuk");
				} else {

					System.out.println("Dogum tarihleri ayn�");
				}
		scan.close();
			}
	}
	}
}
