public class stringmini	{
	public static void main(String[] args)	{
		String s = "Aiubians";
		String ss = "Aiubiant";
		
		System.out.println("Length of s: " + s.length());
		System.out.println("Character at index 2 of s: " + s.charAt(2));
		System.out.println("s equals ss?: " + s.equals(ss));
		System.out.println("Comparison of s with ss: " + s.compareTo(ss));
		System.out.println("Index of 'bi' in s: " + s.indexOf("bi"));
		System.out.println("Index of 'i' in s: " + s.indexOf('i'));
		System.out.println("Substring of s from index 4: " + s.substring(4));
		System.out.println("Substring of s from index 0 to 4: " + s.substring(0, 4));
		System.out.println("s in lowercase: " + s.toLowerCase());
		System.out.println("s in uppercase: " + s.toUpperCase());
		System.out.println("s after replacing 'i' with 'o': " + s.replace('i', 'o'));
		
	}
}