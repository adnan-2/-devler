package odev6;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters çevirmek için bir Java Programý yazýn 
		 * //1.Yol: StringBuilder () kullanarak 
		 * //2.Yol: String Classini kullanarak 
		 * //3.Yol: Bir method oluþturun, ardýndan methodu main method dan çaðýrýn
		 */
		
	        Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen bir veri giriniz");
			String metin= scan.nextLine();
		
			String tersi=" ";
			for (int i = metin.length()-1; i >=0; i--) {
				tersi+= metin.charAt(i);
				
			}
			System.out.println("Ters den yazýlýsý : " + tersi);
	   
	//2.yol
	
	StringBuilder str2 = new StringBuilder("Java cok zormus");
    System.out.println(str2.reverse());
	
	
	 }
	

}
