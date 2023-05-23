package week2.day1;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
	int [] data = {3,2,11,4,6,7};
	 Arrays.sort(data);
	 //System.out.println(data);
	 for(int i=0;i<data.length;i++)
	 {
		System.out.println("Ascending order :" +data[i]); 
		
	 }
	 System.out.println("Second Largest Number:" +data[4]);

	}

}
