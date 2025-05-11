public class Start {
	public static void main(String[] args) {
		// Creating five TextBook objects
		TextBook tb1 = new TextBook("ISBN001", "Math Basics", "John Doe", 250.0, 10, "Grade 1");
		TextBook tb2 = new TextBook("ISBN002", "Science Basics", "Jane Smith", 300.0, 15, "Grade 2");
		TextBook tb3 = new TextBook("ISBN003", "History Basics", "Alan Turing", 200.0, 5, "Grade 3");
		TextBook tb4 = new TextBook("ISBN004", "Geography Basics", "Marie Curie", 350.0, 8, "Grade 4");
		TextBook tb5 = new TextBook("ISBN005", "Physics Basics", "Isaac Newton", 400.0, 12, "Grade 5");

		// Creating five StoryBook objects
		StoryBook sb1 = new StoryBook("ISBN101", "Fairy Tales", "Hans Christian", 150.0, 20, "Fantasy");
		StoryBook sb2 = new StoryBook("ISBN102", "Adventures", "Mark Twain", 180.0, 10, "Adventure");
		StoryBook sb3 = new StoryBook("ISBN103", "Mystery Tales", "Arthur Conan", 220.0, 7, "Mystery");
		StoryBook sb4 = new StoryBook("ISBN104", "Sci-Fi Stories", "Isaac Asimov", 300.0, 5, "Science Fiction");
		StoryBook sb5 = new StoryBook("ISBN105", "Horror Stories", "Stephen King", 250.0, 3, "Horror");

		// Creating a BookShop object
		BookShop bs = new BookShop("My Book Shop");

		// Demonstrating methods for TextBook
		bs.insertTextBook(tb1);
		bs.insertTextBook(tb2);
		bs.insertTextBook(tb3);
		bs.insertTextBook(tb4);
		bs.insertTextBook(tb5);

		System.out.println("All TextBooks in the BookShop:");
		bs.showAllTextBooks();

		System.out.println("\nSearching for TextBook with ISBN 'ISBN003':");
		TextBook foundTextBook = bs.searchTextBook("ISBN003");
		if (foundTextBook != null) {
			System.out.println("Found TextBook: " + foundTextBook.getBookTitle());
		}

		System.out.println("\nRemoving TextBook with ISBN 'ISBN003':");
		bs.removeTextBook(tb3);
		bs.showAllTextBooks();

		// Demonstrating methods for StoryBook
		bs.insertStoryBook(sb1);
		bs.insertStoryBook(sb2);
		bs.insertStoryBook(sb3);
		bs.insertStoryBook(sb4);
		bs.insertStoryBook(sb5);

		System.out.println("\nAll StoryBooks in the BookShop:");
		bs.showAllStoryBooks();

		System.out.println("\nSearching for StoryBook with ISBN 'ISBN104':");
		StoryBook foundStoryBook = bs.searchStoryBook("ISBN104");
		if (foundStoryBook != null) {
			System.out.println("Found StoryBook: " + foundStoryBook.getBookTitle());
		}

		System.out.println("\nRemoving StoryBook with ISBN 'ISBN104':");
		bs.removeStoryBook(sb4);
		bs.showAllStoryBooks();

		System.out.println("\nDemonstrating addQuantity and sellQuantity for TextBook tb1:");
		System.out.println("Original Quantity: " + tb1.getAvailableQuantity());
		tb1.addQuantity(5);
		System.out.println("After adding 5: " + tb1.getAvailableQuantity());
		tb1.sellQuantity(3);
		System.out.println("After selling 3: " + tb1.getAvailableQuantity());

		System.out.println("\nDemonstrating addQuantity and sellQuantity for StoryBook sb1:");
		System.out.println("Original Quantity: " + sb1.getAvailableQuantity());
		sb1.addQuantity(10);
		System.out.println("After adding 10: " + sb1.getAvailableQuantity());
		sb1.sellQuantity(4);
		System.out.println("After selling 4: " + sb1.getAvailableQuantity());
		System.out.println("\nEnd of demonstration.");
	}
}