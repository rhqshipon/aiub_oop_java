public class Student	{
	private int id;
	private String name;
	private double cgpa;
	
	public void setID(int id)	{
		this.id = id;
	}
	public void setName(String name)	{
		this.name = name;
	}
	public void setCGPA(double cgpa)	{
		this.cgpa = cgpa;
	}
	public int getID()	{
		return id;
	}
	public String getName()	{
		return name;
	}
	public double getCGPA()	{
		return cgpa;
	}
	public static void main(String[] args)	{
		Student s1 = new Student();
		s1.setID(88888);
		s1.setName("Random");
		s1.setCGPA(3.25);
		System.out.println("ID: " + s1.getID());
		System.out.println("Name: " + s1.getName());
		System.out.println("CGPA: " + s1.getCGPA());
	}
}