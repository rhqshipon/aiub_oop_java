public class Strings
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		int age = 40;
		String message = "I am " + age + " years old";
		System.out.println(message);
		
		String text1 = "Hello World"; //W = 87
		String text2 = "Hello Universe"; //U = 85
		String text3 = new String("Hello World");
		String text4 = new String("Hello World");
		String text5 = "Hello Universe";
		
		System.out.println("Length of text1: " + text1.length());
		System.out.println("Character at index 7 of text1: " + text1.charAt(7));
		System.out.println("Comparison of text1 and text2: " + text1.compareTo(text2));
		System.out.println("Index of W in text1: " + text1.indexOf('W'));
		System.out.println("Index of World in text1: " + text1.indexOf("World"));
		System.out.println("Subtracting from index 7 of text1: " + text1.substring(7));
		System.out.println("Subtracting from index 0 to 5 of text1: " + text1.substring(0,5));
		System.out.println("Upper case of text1: " + text1.toUpperCase());
		System.out.println("Lower case of text1: " + text1.toLowerCase());
		
		System.out.println("Are text1 and text2 equal? " + text1.equals(text2));
		if(text1 == text2){System.out.println("Strings are equal");}
		else{System.out.println("String memories are not equal");}
		
		System.out.println("Are text3 and text4 equal? " + text3.equals(text4));
		if(text3 == text4){System.out.println("Strings are equal");}
		else{System.out.println("String memories are not equal");}
	}
}