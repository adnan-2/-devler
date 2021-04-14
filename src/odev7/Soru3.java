package odev7;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
	 public static void main(String[] args) {
		 /*
	         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
	         * sayilardan olusan bir array haline getiren bir program yaziniz.
	         *
	         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
	         * OUTPUT : [1,2,3,4,5,6,7,8,9]
	         */

	        
	        List<Integer> list=new ArrayList<>();
	        
	        int arr[]= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	    
	         
	        for (int i=0;i<arr.length;i++) {
	           
	            if (!list.contains(arr[i])) {
	                
	            
	            list.add(arr[i]);
	        }
	        }
	            System.out.println(list);
	            
	        
	    }
	        
}
