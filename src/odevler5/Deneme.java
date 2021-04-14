package odevler5;

public class Deneme {

	public static void main(String[] args) {
		String str = "ilovejavatoo"; // Sadeleþtirilecek kelime. 
 		 
  		int kelimeninUzunlugu = str.length(); // Sadeleþtirilecek kelimenin uzunluðu. 
  		 
  		String tekrarHarf = ""; // Sadeleþtirilecek kelimenin sadeleþmiþ halinin yazýlacaðý kelime. 
  		 
  		System.out.println("Kelimenin normal hali: " + str); // Kelimenin normal hali konsola yazdýrýlýyor. 
  		 
  		for(int i = 0 ; i < kelimeninUzunlugu ; i++) { // Kontrol döngüsü. 
  			char harf1 = str.charAt(i); // Seçilen 1. harf. 
  			char harf2 = ' '; // Kontrol döngüsü sýrasýnda dizinin(kelime uzunluðunun) dýþýna çýkma olasýlýðýna karþý hiçbirþeye eþitlenmeyebilir, bu yüzden ilk olarak boþluk'a eþitleniyor. 
  			 
  			if(i != kelimeninUzunlugu - 1) { // Dizinin dýþýna çýkma olasýlýðýna karþý kontrol. 
  				harf2 = str.charAt(i + 1); // Seçilen 2. harf. 
  			} 
  			 
  			if(harf1 == harf2) { // 1. harf, 2. harf'e eþit deðilse... 
  				tekrarHarf += harf1; // 1. harf sadeleþmiþ kelime'ye ekleniyor. 
  			} 
  		} 
  		 
  		System.out.println("Kelimenin sadeleþmiþ hali: " + tekrarHarf); // Kontrol döngüsü bittikten sonra sadeleþmiþ kelime konsola yazdýrýlýyor. 
  	} 
  }
