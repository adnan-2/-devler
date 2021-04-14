package odev7;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Soru2 {

	public static void main(String[] args) {
		 /*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
		 *  1. Adým : Kullanýcýdan ismini isteyelim
		 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
		 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
		 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
		 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayþe");
			veritabanindakiKullaniciListesi.add("Süleyman");
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
