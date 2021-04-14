package hausaufgaben2;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iþ unvanýnýzý girin");
		String jobTitle=  scan.next().toUpperCase();
		switch (jobTitle) {
		case "QA":
		System.out.println("Ýþ unvanýnýz Quality Analyst");
		break;
		case "DEV":
			System.out.println("Ýþ unvanýnýz Developer");
			break;
			
		case "BA":
			System.out.println("Ýþ unvanýnýz Business Analyst");
			break;
		case "PM":
			System.out.println("Ýþ unvanýnýz Project Manager");
			break;
		default:
			System.out.println("Yanlýs bir unvan yazdýnýz, lutfen kontrol ediniz");
		
		}
		
		scan.close();

	}

}
