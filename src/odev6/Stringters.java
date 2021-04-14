package odev6;

import java.util.Scanner;

public class Stringters {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
		 System.out.println("Tersine cevirmek istediginiz string giriniz");
	        String str = scan.nextLine();
	        System.out.println("Original String :" + str);
	        char temp;
	        char[] arr = str.toCharArray();
	        int len = arr.length;
	        for(int i=0; i<(str.length())/2; i++,len--){
	            temp = arr[i];
	            arr[i] = arr[len-1];
	            arr[len-1] = temp;
	        }

	        System.out.println("Reverse String :" + String.valueOf(arr));
	        	}

}
