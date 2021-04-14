package odev03;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve 3
		 * veya daha fazla karakter içeriyorsa, kelimenin ortasýndaki karakteri
		 * yazdýrýn.
		 */

		System.out.println("Lutfen bir kelime giriniz");
		Scanner scan=new Scanner(System.in);
		String kelime=scan.nextLine();
		int karakterSayisi= kelime.length();
		
		
		if (karakterSayisi%2==1 && karakterSayisi>=3) {
		
			System.out.println(kelime.charAt(karakterSayisi/2));
		}else {
			System.out.println("Yanlýs gýrdýnýz tekrar deneyin");
		}
	}

}
