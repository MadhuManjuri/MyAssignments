package Assignment2;

public class Axisbank extends BankInfo {
	
	public void deposit() {
		System.out.println("This is from deposit method from AxisBank");
	}
	
	public static void main(String[] args)
	{
		BankInfo  info = new BankInfo();
		info.deposit();
	}

}
