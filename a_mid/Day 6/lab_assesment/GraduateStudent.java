public class GraduateStudent extends Student {
	private String researchTopic;
	private String advisorName;
	
	public GraduateStudent(){System.out.println("Student Default Constructor Called!");}
	
	public GraduateStudent(String name, int age, String studentId, String major, String researchTopic, String advisorName)		{
		super(name, age, studentId, major);
		this.researchTopic = researchTopic;
		this.advisorName = advisorName;
	}
	public void displayGraduateInfo() {
		super.displayStudentInfo();
		System.out.println("Research Topic: " + researchTopic);
		System.out.println("Advisor Name: " + advisorName);
	}
}
