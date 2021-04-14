package odevler5;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu
		 * yaziniz. String str=“ilovejavatoo” Output: o v a
		 */
		

	/*	for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.substring(i, i + 1)) != str.lastIndexOf(str.substring(i, i + 1))) {
				System.out.print(str.substring(i, i + 1));

			}
			*/
		
		String counter ="";
		String test = "ilovejavatoo";
		
		for (int i = 0; i < test.length(); i++) {
		    
			for (int j = 0; j < i; j++) {
				if (test.charAt(i) == test.charAt(j)) {
					counter+= test.charAt(j)  ;
					
				}
				System.out.print(counter);
			}
		}
	}
}