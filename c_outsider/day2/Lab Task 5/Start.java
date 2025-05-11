public class Start {
	public static void main(String[] args) {
		// Creating one StoryBook object using constructor
		System.out.println("** Story Book Object 1");
		StoryBook storyBook1 = new StoryBook("123-456-789", "The Great Adventure", "John Doe", 19.99, 10, "Fiction");
		storyBook1.showBookDetails();
		
		// Adding and selling from stock
		storyBook1.addQuantity(4);
		System.out.println("* Available Quantity After Addition: " + storyBook1.getAvailableQuantity());
		storyBook1.sellQuantity(3);
		System.out.println("* Available Quantity After Sale: " + storyBook1.getAvailableQuantity());


		// Creating another StoryBook object and using set methods
		System.out.println("\n\n** Story Book Object 2");
		StoryBook storyBook2 = new StoryBook();
		storyBook2.setIsbn("123-456-789");
		storyBook2.setBookTitle("The Great Adventure");
		storyBook2.setAuthorName("John Doe");
		storyBook2.setPrice(19.99);
		storyBook2.setAvaiableQuantity(10);
		storyBook2.setCategory("Fiction");

		System.out.println("ISBN: " + storyBook2.getIsbn());
		System.out.println("Book Title: " + storyBook2.getBookTitle());
		System.out.println("Author Name: " + storyBook2.getAuthorName());
		System.out.println("Price: " + storyBook2.getPrice());
		System.out.println("Available Quantity: " + storyBook2.getAvailableQuantity());
		System.out.println("Category: " + storyBook2.getCategory());
		
		// Adding and selling from stock
		storyBook2.addQuantity(4);
		System.out.println("* Available Quantity After Addition: " + storyBook2.getAvailableQuantity());
		storyBook2.sellQuantity(3);
		System.out.println("* Available Quantity After Sale: " + storyBook2.getAvailableQuantity());




		// Creating one TextBook object using constructor
		System.out.println("\n\n\n\n** Text Book Object 1");
		TextBook textBook1 = new TextBook("987-654-321", "Advanced Java", "Jane Smith", 29.99, 5, 12);
		textBook1.showBookDetails();

		// Adding and selling from stock
		textBook1.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + textBook1.getAvailableQuantity());
		textBook1.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + textBook1.getAvailableQuantity());


		// Creating another TextBook object and using set methods
		System.out.println("\n\n** Text Book Object 2");
		TextBook textBook2 = new TextBook();
		textBook2.setIsbn("987-654-321");
		textBook2.setBookTitle("Advanced Java");
		textBook2.setAuthorName("Jane Smith");
		textBook2.setPrice(29.99);
		textBook2.setAvaiableQuantity(5);
		textBook2.setStandard(12);

		System.out.println("ISBN: " + textBook2.getIsbn());
		System.out.println("Book Title: " + textBook2.getBookTitle());
		System.out.println("Author Name: " + textBook2.getAuthorName());
		System.out.println("Price: " + textBook2.getPrice());
		System.out.println("Available Quantity: " + textBook2.getAvailableQuantity());
		System.out.println("Standard: " + textBook2.getStandard());
		
		// Adding and selling from stock
		textBook2.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + textBook2.getAvailableQuantity());
		textBook2.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + textBook2.getAvailableQuantity());

	}
}
