package odev7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Soru2 {

	public static void main(String[] args) {
		 /*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
		 *  1. Ad�m : Kullan�c�dan ismini isteyelim
		 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
		 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
		 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
		 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ay�e");
			veritabanindakiKullaniciListesi.add("S�leyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
		 */
	
		        boolean flag=false;
		        Scanner scan=new Scanner(System.in);
		        
		        List<String> list=new ArrayList<>();
		        Random r=new Random();
		        list.add("Nazmi");
		        list.add("Ahmet");
		        list.add("Ayse");
		        list.add("Suleyman");
		        list.add("Sibel");
		        
		        
		        System.out.println("Lutfen kullanici adinizi giriniz.");
		        
		        
		        String userName=scan.nextLine();    
		        
		        
		        kontrol(userName);
		        
		        
		        while (kontrol(userName)==false) {
		            
		            System.out.println("Lutfen uygun bir kullanici adi giriniz.");
		            
		            
		             userName=scan.nextLine();  
		            
		            
		        }
		        
		        userName=userName.replaceAll("\\s", "");
		        
		        
		        for (int i=0;i<list.size();i++) {
		                
		            if (!list.contains(userName)) {
		                 flag=true;
		                
		            }
		            
		            }
		        
		        if (flag) {
		            
		            System.out.println("Kullanici adiniz: "+userName);
		        }else System.out.println("Bu kullanici adi var. Kullanci adiniz:"+userName+r.nextInt(100)+" olsun");
		        
		        
		    }
		    public static boolean kontrol(String name) {
		        
		        boolean flag=true;
		        
		        name=name.toLowerCase();
		        
		        for (int i=0;i<name.length();i++) {
		            
		            if (name.charAt(i)>='a' && name.charAt(i)<='z' || name.charAt(i)>='0' && name.charAt(i)<='9') {
		                
		                flag= true;
		            
		            } else flag= false;
		        }
		        
		        return flag;
		        

	}

}
