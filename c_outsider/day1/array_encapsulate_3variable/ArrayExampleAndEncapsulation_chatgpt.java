import java.lang.*;

public class ArrayExampleAndEncapsulation {

	public static void main(String[] args) {

		Person persons[] = new Person[3];

		persons[0] = new Person(1, "Abu", 18);
		persons[1] = new Person(2, "Babor", 21);
		persons[2] = new Person(3, "Chitu", 19);

		for(int i = 0; i < persons.length; i++) {
			persons[i].displayInfo();
		}
	}
}

class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("ID = " + id + " Name = " + name + " Age = " + age);
	}
}
