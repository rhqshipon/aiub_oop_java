public class ArrayExample {
	public static void main(String[] args) {
		
		int arr1[] = new int[3];
		arr1[0] = 20;

		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		Person persons[] = new Person[3];
		persons[0] = new Person(1, "abc", 50);

		for(int i = 0; i < persons.length; i++) {
			if(persons[i] == null) {
				System.out.println(persons[i]);
			}
			else {
				persons[i].show();
			}
		}
	}
}

class Person {
	private int id;
	private String name;
	private int age;

	public Person() {
		System.out.println("Default Constructor of Person");
	}

	public Person(int i, String n, int a) {
		System.out.println("Parameterized Constructor of Person");
		id = i;
		name = n;
		age = a;
	}

	public void show() {
		System.out.println(" id = " + id + "\n name = " + name + "\n age = " + age);
	}
}
