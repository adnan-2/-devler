package odev7;
public class Soru1 {

	public static void main(String[] args) {

		/*
		//Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
				//1.Yol: 3. degisken kullanarak 
				//2.Yol: 3. degisken kullanmadan
	
		*/

		
		// 1. YOL
				int a = 5; 
				int b = 10;
				int temp;
				System.out.println("a = " + a + "  b = " + b ); // a = 5  b = 10
				temp = a;
				a = b;
				b = temp;
				System.out.println("swap a = " + a + " swap b = " + b ); // swap a = 10 swap b = 5
				
				// 2. YOL
				int c = 20;
				int d = 40;
				System.out.println("c = " + c +" d = " + d); // c = 20 d = 40
				c = c+d; // c = 20 + 40 = 60
				d = c-d; // d = 60 - 40 = 20
				c = c-d; // c = 60 - 20 = 40
				System.out.println("swap c = " + c +" swap d = " + d); // swap c = 40 swap d = 20

		        
		    }
		        }