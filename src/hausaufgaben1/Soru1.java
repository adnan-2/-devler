package hausaufgaben1;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// Asagýdaki String degiskenini kullanarak konsolda A L Ý yazdýrýn,
		// String pickName="ABCDEFGHIKLMNOPQRSTUVWXZY";
		Scanner scan= new Scanner(System.in);
		String pickName="ABCDEFGHIKLMNOPQRSTUVWXZY";

		System.out.println(pickName.charAt(0)+ " "+ pickName.charAt(10)+ " " +pickName.toLowerCase().charAt(8));
	scan.close();
	}
 
}
