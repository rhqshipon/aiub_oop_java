public class Person {
	private String name;
	private int age;
	
	public Person(){System.out.println("Person Default Constructor Called!");}
	
	public Person(String name, int age)		{
		this.name = name;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
