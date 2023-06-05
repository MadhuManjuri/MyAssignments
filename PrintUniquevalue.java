package week3.day4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniquevalue {

	public static void main(String[] args) {
		   int[] num= {4,3,6,8,29,1,2,4,7,8};
	        //2,4,7
	        
	        Set<Integer> unq= new TreeSet<>();
	        Set<Integer> dup= new TreeSet<>();
	        
	        //Iterator for integer
	        
//	        for (Integer i : num) {
//	            unq.add(i);
//	        }
	        
	        for (int i = 0; i < num.length; i++) {
	            
	            boolean add = unq.add(num[i]);
	            if(!add) {
	                dup.add(num[i]);
	            }
	        }
	        System.out.println(unq);
	        System.out.println(dup);
	        
	        
//	        //how to convert set into list
//	        
//	        List<Integer>data= new ArrayList<>(unq);
//	         
//	         System.out.println("its coming from list :"+data);
//	        
//	        Integer value = data.get(5);
//	        
//	        System.out.println(value);
	}
}