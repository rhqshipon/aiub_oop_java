public class BookShop {
	private String name;
	private Book[] books; // size of array should be 100.

	public BookShop() {
		books = new Book[100]; // Initialize the array with size 100
	}

	public BookShop(String name) {
		this.name = name;
		books = new Book[100]; // Initialize the array with size 100
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean insertBook(Book b) {
		for (int i = 0; i < 100; i++) {
			if (books[i] == null) {
				books[i] = b;
				return true;
			}
		}
		return false;
	}

	public boolean removeBook(Book b) {
		for (int i = 0; i < 100; i++) {
			if (books[i] == b) {
				books[i] = null;
				return true;
			}
		}
		return false;
	}

	public Book searchBook(String isbn) {
		for (int i = 0; i < 100; i++) {
			if (books[i] != null && books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null; // Return null if no matching TextBook is found
	}

	public void showAllBooks() {
		for (int i = 0; i < 100; i++) {
			if (books[i] != null) {
				System.out.println("\n\n---------------------------------------------------------------");
				System.out.println("Showing details for Text Book at index " + i);
				System.out.println("ISBN: " + books[i].getIsbn());
				System.out.println("Book Title: " + books[i].getBookTitle());
				System.out.println("Author Name: " + books[i].getAuthorName());
				System.out.println("Price: " + books[i].getPrice());
				System.out.println("Available Quantity: " + books[i].getAvailableQuantity());
				// System.out.println("Standard: " + books[i].getStandard());
				System.out.println("---------------------------------------------------------------");
			}
		}
	}
}