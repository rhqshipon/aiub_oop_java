public class BookShop {
	private String name;
	private TextBook[] textBooks; // size of array should be 100.
	private StoryBook[] storyBooks; // size of array should be 100.

	public BookShop() {
		textBooks = new TextBook[100]; // Initialize the array with size 100
		storyBooks = new StoryBook[100]; // Initialize the array with size 100
	}

	public BookShop(String name) {
		this.name = name;
		textBooks = new TextBook[100]; // Initialize the array with size 100
		storyBooks = new StoryBook[100]; // Initialize the array with size 100
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean insertTextBook(TextBook tb) {
		for (int i = 0; i < 100; i++) {
			if (textBooks[i] == null) {
				textBooks[i] = tb;
				return true;
			}
		}
		return false;
	}

	public boolean removeTextBook(TextBook tb) {
		for (int i = 0; i < 100; i++) {
			if (textBooks[i] == tb) {
				textBooks[i] = null;
				return true;
			}
		}
		return false;
	}

	public TextBook searchTextBook(String isbn) {
		for (int i = 0; i < 100; i++) {
			if (textBooks[i] != null && textBooks[i].getIsbn().equals(isbn)) {
				return textBooks[i];
			}
		}
		return null; // Return null if no matching TextBook is found
	}

	public void showAllTextBooks() {
		for (int i = 0; i < 100; i++) {
			if (textBooks[i] != null) {
				System.out.println("\n\n---------------------------------------------------------------");
				System.out.println("Showing details for Text Book at index " + i);
				System.out.println("ISBN: " + textBooks[i].getIsbn());
				System.out.println("Book Title: " + textBooks[i].getBookTitle());
				System.out.println("Author Name: " + textBooks[i].getAuthorName());
				System.out.println("Price: " + textBooks[i].getPrice());
				System.out.println("Available Quantity: " + textBooks[i].getAvailableQuantity());
				System.out.println("Standard: " + textBooks[i].getStandard());
				System.out.println("---------------------------------------------------------------");
			}
		}
	}

	public boolean insertStoryBook(StoryBook sb) {
		for (int i = 0; i < 100; i++) {
			if (storyBooks[i] == null) {
				storyBooks[i] = sb;
				return true; // Insertion successful
			}
		}
		return false; // Insertion failed (array full)
	}

	public boolean removeStoryBook(StoryBook sb) {
		for (int i = 0; i < 100; i++) {
			if (storyBooks[i] == sb) {
				storyBooks[i] = null;
				return true;
			}
		}
		return false; // Return false if the StoryBook is not found
	}

	public StoryBook searchStoryBook(String isbn) {
		for (int i = 0; i < 100; i++) {
			if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn)) {
				return storyBooks[i];
			}
		}
		return null; // Return null if no matching StoryBook is found
	}

	public void showAllStoryBooks() {
		for (int i = 0; i < 100; i++) {
			if (storyBooks[i] != null) {
				System.out.println("\n\n---------------------------------------------------------------");
				System.out.println("Showing details for Story Book at index " + i);
				System.out.println("ISBN: " + storyBooks[i].getIsbn());
				System.out.println("Book Title: " + storyBooks[i].getBookTitle());
				System.out.println("Author Name: " + storyBooks[i].getAuthorName());
				System.out.println("Price: " + storyBooks[i].getPrice());
				System.out.println("Available Quantity: " + storyBooks[i].getAvailableQuantity());
				System.out.println("Category: " + storyBooks[i].getCategory());
				System.out.println("---------------------------------------------------------------");
			}
		}
	}
}