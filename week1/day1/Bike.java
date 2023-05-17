package week1.day1;

public class Bike {

	public void driveBike() {
		
		System.out.println("DriveBike");
	}
	
	public void applyBrake() {
		System.out.println("ApplyBrake");
	}
	public void soundHorn() {
		System.out.println("SoundHorn");
	}
	public void isPuncture() {
		System.out.println("IsPuncture");
	}
	public static void main(String args[]) {
		Bike b = new Bike() ;
		b.driveBike();	
		b.applyBrake();
		b.soundHorn();
		b.isPuncture();
	}
	
}
