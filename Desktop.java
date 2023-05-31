package Assignment1;

public class Desktop extends Computer {
	
	public void desktopsize() {
		System.out.println("This is a desktopsize");
	}
	public void main (String [] args)
	{
		Desktop desktop = new Desktop();
		desktop.computermodel();
		desktop.desktopsize();
	}

}
