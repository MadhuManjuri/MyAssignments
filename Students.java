package Assignment4;

public class Students {
	public int getStudentInfo (int id) {
		System.out.println("This is a getStudentInfo : "+id);
		return id;
	}
	public String getStudentInfo1(String name) {
		System.out.println("This is a getStudentInfo : "+name);
		return name;
	}
	public String getStudentInfo(String email) {
		System.out.println("This is a getStudentInfo : "+email);
		return email;
	}
	public double getStudentInfo(double phoneno) {
		System.out.println("This is a getStudentInfo : "+phoneno);
		return phoneno;
	}
	public static void main(String[] args)
	{
		Students student = new Students();
		student.getStudentInfo(11);
		student.getStudentInfo1("Madhu");
		student.getStudentInfo("Testleaf@gmail.com");
		student.getStudentInfo(978769878);
	}

}
