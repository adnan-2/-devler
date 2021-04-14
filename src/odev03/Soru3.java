package odev03;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		Ternary kullanarak:
				int variable : price
				string variable : decision
				price = $10 ise Print “cheap”
				price 10-$20 arasi ise Print “ok”
				diger durumlar icin “expensive” yazdirin.
			*/
		System.out.println("Lutfen price giriniz");
		Scanner scan = new Scanner(System.in);
		int price= scan.nextInt();
		
		String decision= price==10 ? "cheap" : price>10 && price<20 ? "ok" : price>20 ? "expensive" : "Tekrar giriniz";
        
		System.out.println(decision);
	
	}

}
	