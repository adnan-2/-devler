package hausaufgaben2;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
        Print "L�tfen i� unvan�n�z� girin� 
        �jobTitle� isimli bir degisken olusturun ve kullanicidan isteyin.
        Do�ru jobTitle yazd�rmak i�in a�a��daki test datalarini kullan�n. Example :
        Eger jobTitle  qa ise print ��� unvan�n�z Quality Analyst� 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen i� unvan�n�z� girin");
		String jobTitle=  scan.next().toUpperCase();
		switch (jobTitle) {
		case "QA":
		System.out.println("�� unvan�n�z Quality Analyst");
		break;
		case "DEV":
			System.out.println("�� unvan�n�z Developer");
			break;
			
		case "BA":
			System.out.println("�� unvan�n�z Business Analyst");
			break;
		case "PM":
			System.out.println("�� unvan�n�z Project Manager");
			break;
		default:
			System.out.println("Yanl�s bir unvan yazd�n�z, lutfen kontrol ediniz");
		
		}
		
		scan.close();

	}

}
