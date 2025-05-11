public class Start {
    public static void main(String[] args) {
        Book book1 = new Book("12345", "Java Programming", "John Doe", 500.0, 10);
        Book book2 = new Book("67890", "Python Basics", "Jane Smith", 300.0, 15);
        Book book3 = new Book("11223", "C++ Essentials", "Alice Brown", 400.0, 8);
        Book book4 = new Book("44556", "Web Development", "Bob White", 350.0, 12);
        Book book5 = new Book("77889", "Data Structures", "Charlie Green", 450.0, 5);

        Book[] books = {book1, book2, book3, book4, book5};

        for (int i = 0; i < books.length; i++) {
			if (books[i] != null)	{
				books[i].showDetails();
				System.out.println();
			}
            else	{
				System.out.println("Index " + i + " is null!");
			}
        }
    }
}
