package hausaufgaben2;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�n� 1 ile 7 aras�nda bir say� girdi�inde haftan�n hangi g�n� oldu�unu
		 * yazd�ran switch case java kodunu yazin�z.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 1 ile 7 (dahil)aras�nda bir rakam giriniz");
		int rakam= scan.nextInt();
		switch(rakam) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lutfen gecerli bir rakam giriniz");
			
		}
		scan.close();
	}

}
