import java.lang.*;

public class ArrayExampleAndEncapsulation {

	public static void main(String[] args) {

		Person persons[] = new Person[3];

		for(int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].setID(i + 1);
		}

		persons[0].setName("Abu");
		persons[0].setAge(18);

		persons[1].setName("Babor");
		persons[1].setAge(21);

		persons[2].setName("Chitu");
		persons[2].setAge(19);

		for(int i = 0; i < persons.length; i++) {
			System.out.println("ID = " + persons[i].getID() + " name = " + persons[i].getName() + " age = " + persons[i].getAge());
		}
	}
}

class Person {
	private int id;
	private String name;
	private int age;

	Person() {
		System.out.println("Default Constructor of Person");
	}

	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
