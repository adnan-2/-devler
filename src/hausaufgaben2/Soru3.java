package hausaufgaben2;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		“NestedIfStatements” class olusturun.
		
	Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		
	Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
	Examples:
		int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
		int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
		Yusuf is Older            
	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci kisinin dogum yýlýný gýrýnýz");
		int yil1=scan.nextInt();
		System.out.println("Ýkinci kisinin dogum yýlýný gýrýnýz");
		int yil2= scan.nextInt();
	
		if (yil1>yil2) {
			System.out.println("Birinci kisinin yasý kucuk");
		} else if (yil1<yil2) {
			System.out.println("Ýkinci kisinin yasý kucuk");
		} else {

			System.out.println("Birinci kisinin dogum ayiný giriniz");
			int ay1=scan.nextInt();
			System.out.println("Ýkinci kisinin dogum ayiný giriniz");
			int ay2=scan.nextInt();
			if (ay1>ay2) {
				System.out.println("Birinci kisinin yasý kucuk");
			} else if (ay1<ay2) {
				System.out.println("Ýkinci kisinin yasý kucuk");
			} else {

				System.out.println("Birinci kisinin dogum gununu giriniz");
				int gun1= scan.nextInt();
				System.out.println("Birinci kisinin dogum gununu giriniz");
				int gun2= scan.nextInt();
				if (gun1>gun2) {
					System.out.println("Ýkinci kisi buyuk");
				} else if (gun1<gun2) {
					System.out.println("Birinci kisi buyuk");
				} else {

					System.out.println("Dogum tarihleri ayný");
				}
		scan.close();
			}
	}
	}
}
