package week2.day1;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int num[] = {3,5,3,6,7,5,3,9,5};
		for(int i =0;i<=num.length;i++)
		{
			for(int j= i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
			}
		}
	}

}
