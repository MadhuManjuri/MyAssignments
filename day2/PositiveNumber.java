package week1.day2;

public class PositiveNumber {

	public static void main(String[] args) {
		int positiveno;
		int negativeno = -40;
		if(negativeno <0)
		{
			System.out.println("!!!Provided number is negative :"+negativeno);
			positiveno = negativeno *(-1);
			System.out.println("!!!Converted postive value : "+positiveno );			
		}
		else
		{
			System.out.println("Number is positive");
		}

	}

}
