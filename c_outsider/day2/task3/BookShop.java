public class BookShop implements BookShopOperations {
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

	@Override
	public boolean insertBook(Book b) {
		return insertBookDefault(books, b);
	}

	@Override
	public boolean removeBook(Book b) {
		return removeBookDefault(books, b);
	}

	@Override
	public Book searchBook(String isbn) {
		return searchBookDefault(books, isbn);
	}

	@Override
	public void showAllBooks() {
		showAllBooksDefault(books);
	}

}