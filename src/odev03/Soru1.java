package odev03;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/* 			
        Kullan�c�n�n girmi� oldu�u A,B,C,D,F notlar�n�n kar��l���n� yazd�ran Switch Case java kodunu yaz�n�z.					
        A	Excellent				
        B	Good				
        C	Average				
        D	Deficient				
        F	Failing								
		 */
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("L�tfen notlar�n�z� Harf olarak giriniz");
		char harf =  scan.next().charAt(0);
		switch (harf) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;
		default:
			System.out.println("Gecersiz bir Harf girdiniz");
		}
	*/
		System.out.println("Lutfen notunuyu giriniz");
		String not = scan.next().toUpperCase();
		
		switch (not) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Average");
			break;
		case "D":
			System.out.println("Deficient");
			break;
		case "F":
			System.out.println("Failing");
			break;
		default:
			System.out.println("Gecersiz bir Harf girdiniz");
		}
		
	}

}
