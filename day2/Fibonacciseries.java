package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		int range = 7;
		int firstNum = 0;
		int secondnum = 1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secondnum);
		for(int i=1;i<range;++i)
		{
			
			sum = firstNum + secondnum;			
			firstNum= secondnum;
			secondnum = sum;
			System.out.println("" +sum);
		}
	

	}

}
