package odevler5;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * a. 1-20 arasindaki - 20 dahil olmak �zere- �ift say�lar� yazd�r�n. e.g.2 4 6
		 * .. 20
		 * b. 1-20 arasindaki -20 dahil olmak �zere- tek say�lar� yazd�r�n. e.g
		 * 1,3,5,7,...,19 Virgul dahil!
		 * c. 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek
		 * yazdirin. e.g.20,15,10,5
		 * �. 1 - 20 aras�ndaki t�m �ift say�lar�n toplam�n� bulun.
		 * d. 11 veya 15 hari� 1-20 aras�ndaki t�m say�lar� yazd�r�n; break or continue
		 * kullanin.
		 */
		
		 for (int i = 2; i <= 20; i+=2) {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        for (int i = 1; i <= 20; i+=2) {
	            System.out.print(i+",");
	        }
	        System.out.println();
	        
	        for (int i = 20; i > 1; i-=5) {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        int toplam=0;
	        for (int i = 2; i <= 20; i+=2) {
	            toplam+=i;
	        }
	        System.out.println(toplam);
	        
	        for (int i = 1; i < 21; i++) {
	            if (i==11) {
	                continue;
	            }
	            System.out.print(i+",");
}
}
}