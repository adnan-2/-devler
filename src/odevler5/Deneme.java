package odevler5;

public class Deneme {

	public static void main(String[] args) {
		String str = "ilovejavatoo"; // Sadele�tirilecek kelime. 
 		 
  		int kelimeninUzunlugu = str.length(); // Sadele�tirilecek kelimenin uzunlu�u. 
  		 
  		String tekrarHarf = ""; // Sadele�tirilecek kelimenin sadele�mi� halinin yaz�laca�� kelime. 
  		 
  		System.out.println("Kelimenin normal hali: " + str); // Kelimenin normal hali konsola yazd�r�l�yor. 
  		 
  		for(int i = 0 ; i < kelimeninUzunlugu ; i++) { // Kontrol d�ng�s�. 
  			char harf1 = str.charAt(i); // Se�ilen 1. harf. 
  			char harf2 = ' '; // Kontrol d�ng�s� s�ras�nda dizinin(kelime uzunlu�unun) d���na ��kma olas�l���na kar�� hi�bir�eye e�itlenmeyebilir, bu y�zden ilk olarak bo�luk'a e�itleniyor. 
  			 
  			if(i != kelimeninUzunlugu - 1) { // Dizinin d���na ��kma olas�l���na kar�� kontrol. 
  				harf2 = str.charAt(i + 1); // Se�ilen 2. harf. 
  			} 
  			 
  			if(harf1 == harf2) { // 1. harf, 2. harf'e e�it de�ilse... 
  				tekrarHarf += harf1; // 1. harf sadele�mi� kelime'ye ekleniyor. 
  			} 
  		} 
  		 
  		System.out.println("Kelimenin sadele�mi� hali: " + tekrarHarf); // Kontrol d�ng�s� bittikten sonra sadele�mi� kelime konsola yazd�r�l�yor. 
  	} 
  }
