package hausaufgaben1;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// Asag�daki String degiskenini kullanarak konsolda A L � yazd�r�n,
		// String pickName="ABCDEFGHIKLMNOPQRSTUVWXZY";
		Scanner scan= new Scanner(System.in);
		String pickName="ABCDEFGHIKLMNOPQRSTUVWXZY";

		System.out.println(pickName.charAt(0)+ " "+ pickName.charAt(10)+ " " +pickName.toLowerCase().charAt(8));
	scan.close();
	}
 
}
