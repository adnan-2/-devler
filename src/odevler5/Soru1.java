package odevler5;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim ve karakter girmesini isteyin, sonra karakterin ka� kez
		 * tekrarland���n� kontrol edin. e.g: char ch1= 'a' ; String name =�John came
		 * late" => Tekrar Sayisi = 2
		 */
		Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim=scan.nextLine().toLowerCase();
        System.out.println("ismin icinde aramak istediginiz bir karakter giriniz");
        String chr=scan.next().toLowerCase();
        
        int sayac=0;
        
        for (int i = 0; i < isim.length(); i++) {
            if (isim.substring(i, i+1).equals(chr)) {
                sayac++;
            }
        }
        System.out.println("Tekrar sayisi: " +sayac);
	}

}
