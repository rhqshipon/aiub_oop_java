public class Start {
	public static void main(String[] args) {
		// Creating 5 StoryBook objects
		Book sb1 = new StoryBook("SB001", "The Hobbit", "J.R.R. Tolkien", 15.99, 10, "Fantasy");
		Book sb2 = new StoryBook("SB002", "1984", "George Orwell", 12.99, 8, "Dystopian");
		Book sb3 = new StoryBook("SB003", "To Kill a Mockingbird", "Harper Lee", 10.99, 5, "Classic");
		Book sb4 = new StoryBook("SB004", "The Great Gatsby", "F. Scott Fitzgerald", 14.99, 7, "Classic");
		Book sb5 = new StoryBook("SB005", "Harry Potter", "J.K. Rowling", 20.99, 15, "Fantasy");

		// Creating 5 TextBook objects
		Book tb1 = new TextBook("TB001", "Mathematics", "R.D. Sharma", 25.99, 20, "Grade 10");
		Book tb2 = new TextBook("TB002", "Physics", "H.C. Verma", 30.99, 15, "Grade 12");
		Book tb3 = new TextBook("TB003", "Chemistry", "O.P. Tandon", 28.99, 18, "Grade 11");
		Book tb4 = new TextBook("TB004", "Biology", "Truman", 22.99, 12, "Grade 10");
		Book tb5 = new TextBook("TB005", "History", "Bipan Chandra", 18.99, 10, "Grade 9");

		// Creating a BookShop object
		BookShop bookShop = new BookShop("My Book Shop");

		// Demonstrating methods
		// Inserting books into the BookShop
		bookShop.insertBook(sb1);
		bookShop.insertBook(sb2);
		bookShop.insertBook(sb3);
		bookShop.insertBook(sb4);
		bookShop.insertBook(sb5);
		bookShop.insertBook(tb1);
		bookShop.insertBook(tb2);
		bookShop.insertBook(tb3);
		bookShop.insertBook(tb4);
		bookShop.insertBook(tb5);

		// Searching for a book
		Book searchedBook = bookShop.searchBook("TB003");
		if (searchedBook != null) {
			System.out.println("Book found: " + searchedBook.getBookTitle());
		} else {
			System.out.println("Book not found.");
		}

		// Removing a book
		boolean isRemoved = bookShop.removeBook(tb5);
		System.out.println("Book removed: " + isRemoved);

		// Showing all books
		bookShop.showAllBooks();

		// Demonstrating addQuantity and sellQuantity
		System.out.println("\n--- Demonstrating addQuantity and sellQuantity ---");
		System.out.println("Before adding, tb1 quantity: " + tb1.getAvailableQuantity());
		tb1.addQuantity(5);
		System.out.println("After adding 5, tb1 quantity: " + tb1.getAvailableQuantity());

		System.out.println("Before selling, sb1 quantity: " + sb1.getAvailableQuantity());
		sb1.sellQuantity(3);
		System.out.println("After selling 3, sb1 quantity: " + sb1.getAvailableQuantity());
		System.out.println("\nEnd of demonstration.");
	}
}