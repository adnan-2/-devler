package odev6;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters �evirmek i�in bir Java Program� yaz�n 
		 * //1.Yol: StringBuilder () kullanarak 
		 * //2.Yol: String Classini kullanarak 
		 * //3.Yol: Bir method olu�turun, ard�ndan methodu main method dan �a��r�n
		 */
		
	        Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen bir veri giriniz");
			String metin= scan.nextLine();
		
			String tersi=" ";
			for (int i = metin.length()-1; i >=0; i--) {
				tersi+= metin.charAt(i);
				
			}
			System.out.println("Ters den yaz�l�s� : " + tersi);
	   
	//2.yol
	
	StringBuilder str2 = new StringBuilder("Java cok zormus");
    System.out.println(str2.reverse());
	
	
	 }
	

}
