public class Start {
    public static void main(String[] args) {
		// Creating one Book object using constructor
		System.out.println("** Book Object 1");
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe", 29.99, 10);
		
		book1.showDetails();
		
		// Adding and selling from stock
		book1.addQuantity(6);
		System.out.println("* Available Quantity After Addition: " + book1.getAvailableQuantity());
		book1.sellQuantity(4);
		System.out.println("* Available Quantity After Sale: " + book1.getAvailableQuantity());
		
		// Creating another Book object and using set methods
		System.out.println("\n\n** Book Object 2");
        Book book2 = new Book();

        book2.setIsbn("978-1-234-56789-7");
        book2.setBookTitle("Python Programming");
        book2.setAuthorName("Jane Smith");
        book2.setPrice(39.99);
        book2.setAvaiableQuantity(5);

        System.out.println("ISBN: " + book2.getIsbn());
        System.out.println("Title: " + book2.getBookTitle());
        System.out.println("Author: " + book2.getAuthorName());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println("Available Quantity: " + book2.getAvailableQuantity());
		
		// Adding and selling from stock
		book2.addQuantity(5);
		System.out.println("* Available Quantity After Addition: " + book2.getAvailableQuantity());
		book2.sellQuantity(3);
		System.out.println("* Available Quantity After Sale: " + book2.getAvailableQuantity());
    }
}
