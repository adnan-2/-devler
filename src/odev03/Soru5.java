package odev03;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3
		 * veya daha fazla karakter i�eriyorsa, kelimenin ortas�ndaki karakteri
		 * yazd�r�n.
		 */

		System.out.println("Lutfen bir kelime giriniz");
		Scanner scan=new Scanner(System.in);
		String kelime=scan.nextLine();
		int karakterSayisi= kelime.length();
		
		
		if (karakterSayisi%2==1 && karakterSayisi>=3) {
		
			System.out.println(kelime.charAt(karakterSayisi/2));
		}else {
			System.out.println("Yanl�s g�rd�n�z tekrar deneyin");
		}
	}

}
