package week3.day4;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Printuniquechar {

	public static void main(String[] args) {
		
		 String name="MadhuManjuri";
	        
	        char[] ch = name.toCharArray();
	        
	        Set<Character> unq= new LinkedHashSet<>();
	        Set<Character> dup= new LinkedHashSet<>();
	        
//	        for (int i = 0; i < ch.length; i++) {
//	            
//	        }
	        String output="";
	        
	        for (Character i : ch) {
	            if(!unq.add(i)) {
	                output=output+i;
	               dup.add(i);
	            }
	        }
	        System.out.println(output);
	        System.out.println(unq);
	        System.out.println(dup);

}
}
