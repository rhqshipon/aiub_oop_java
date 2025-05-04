public class Student extends Person {
	private String studentId;
	private String major;
	
	public Student(){System.out.println("Student Default Constructor Called!");}
	
	public Student(String name, int age, String studentId, String major)		{
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	public void displayStudentInfo()  {
		super.displayInfo();
		System.out.println("Student ID: " + studentId);
		System.out.println("Major: " + major);
	}
}