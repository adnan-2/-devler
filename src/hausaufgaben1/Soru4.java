package hausaufgaben1;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		// Soru4)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Uc basamaklý bir sayi giriniz ");
		int sayi = scan.nextInt();
		int birlerBas=sayi%10;
		sayi/=10;
		int onlarBas= sayi%10;
		 sayi/=10;
		 int yuzlerBas= sayi%10;
		 
		 
		 System.out.println(birlerBas+onlarBas+yuzlerBas);
		scan.close();

	}

}
