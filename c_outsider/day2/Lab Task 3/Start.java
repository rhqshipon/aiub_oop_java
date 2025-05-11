public class Start {
    public static void main(String[] args) {
		// Creating one StoryBook object using constructor
        System.out.println("** Story Book Object 1");
        StoryBook storyBook1 = new StoryBook("978-0140437713", "The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 15.99, 30, "Mystery");
        storyBook1.showDetails();
		
		// Adding and selling from stock
		storyBook1.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + storyBook1.getAvailableQuantity());
		storyBook1.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + storyBook1.getAvailableQuantity());
		
		// Setting and getting discount rate
        storyBook1.setDiscountRate(.20);
        System.out.println("* Discount Price: $" + storyBook1.getDiscountRate());


		// Creating another StoryBook object and using set methods
        System.out.println("\n\n** Story Book Object 2");
        StoryBook storyBook2 = new StoryBook();
        storyBook2.setIsbn("978-0747532699");
        storyBook2.setBookTitle("Harry Potter and the Philosopher's Stone");
        storyBook2.setAuthorName("J.K. Rowling");
        storyBook2.setPrice(20.99);
        storyBook2.setAvaiableQuantity(50);
        System.out.println("ISBN: " + storyBook2.getIsbn());
        System.out.println("Title: " + storyBook2.getBookTitle());
        System.out.println("Author: " + storyBook2.getAuthorName());
        System.out.println("Price: $" + storyBook2.getPrice());
		
		// Adding and selling from stock
        System.out.println("Available Quantity: " + storyBook2.getAvailableQuantity());
		storyBook2.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + storyBook2.getAvailableQuantity());
		storyBook2.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + storyBook2.getAvailableQuantity());

        // Setting and getting discount rate
        storyBook2.setDiscountRate(.10);
        System.out.println("* Discount Price: $" + storyBook2.getDiscountRate());




        // Creating one TextBook object using constructor
		System.out.println("\n\n\n\n** Text Book Object 1");
        TextBook textBook1 = new TextBook("978-0262033848", "Introduction to Algorithms", "Thomas H. Cormen", 99.99, 20, 10);
        textBook1.showDetails();
		
		// Adding and selling from stock
		textBook1.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + textBook1.getAvailableQuantity());
		textBook1.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + textBook1.getAvailableQuantity());
		
		// Setting and getting discount rate
        textBook1.setDiscountRate(.19);
        System.out.println("* Discount Price: $" + textBook1.getDiscountRate());


        // Creating another TextBook object and using set methods
		System.out.println("\n\n** Text Book Object 2");
        TextBook textBook2 = new TextBook();
        textBook2.setIsbn("978-0131103627");
        textBook2.setBookTitle("The C Programming Language");
        textBook2.setAuthorName("Brian W. Kernighan, Dennis M. Ritchie");
        textBook2.setPrice(65.99);
        textBook2.setAvaiableQuantity(40);
        textBook2.setStandard(12);

        System.out.println("ISBN: " + textBook2.getIsbn());
        System.out.println("Title: " + textBook2.getBookTitle());
        System.out.println("Author: " + textBook2.getAuthorName());
        System.out.println("Price: $" + textBook2.getPrice());
        System.out.println("Available Quantity: " + textBook2.getAvailableQuantity());
        System.out.println("Standard: " + textBook2.getStandard());
		
		// Adding and selling from stock
		textBook2.addQuantity(7);
		System.out.println("* Available Quantity After Addition: " + textBook2.getAvailableQuantity());
		textBook2.sellQuantity(2);
		System.out.println("* Available Quantity After Sale: " + textBook2.getAvailableQuantity());
		
		// Setting and getting discount rate
        textBook2.setDiscountRate(.25);
        System.out.println("* Discount Price: $" + textBook2.getDiscountRate());
        
    }
}
