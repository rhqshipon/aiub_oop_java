public class Main {
	public static void main(String[] args) {
		System.out.println("--------------------------------------------- Base");
		Base b1 = new Base();
		b1.meowFunction();
		
		System.out.println("--------------------------------------------- One Inheritance");
		Base c1 = new Child1();
		c1.meowFunction();
		
		System.out.println("--------------------------------------------- One Inheritance");
		Base c2 = new Child2();
		c2.meowFunction();
		
		System.out.println("--------------------------------------------- Two Inheritance");
		Base c3 = new Child3();
		c3.meowFunction();
		
		System.out.println("--------------------------------------------- Three Inheritance");
		Base c4 = new Child4();
		c4.meowFunction();
		
		System.out.println("--------------------------------------------- Four Inheritance");
		Base c5 = new Child5();
		c5.meowFunction();
	}
}
