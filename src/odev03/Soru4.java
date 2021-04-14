package odev03;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/*
		 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
		 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
		 * sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik”
		 * yazdirin. e.g: name1= mehmet name2= ahmet Print ==> mehahmetmet
		 */

		System.out.println("name1 giriniz");
		System.out.println("name2 giriniz");
		Scanner scan=new Scanner(System.in);
		String name1=scan.nextLine();
		String name2=scan.nextLine();
		int karakterSayisi1= name1.length();
		
		
	
		if (karakterSayisi1%2==0) {
			int ortHarf = name1.length()/2;
			if (name1.length()%2==0) {
	            System.out.println(name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2, name1.length()));
	            
	        } else {
	            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
	        }



			
		}
	
	
	
	
	}

}
