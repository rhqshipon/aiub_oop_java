public interface BookShopOperations {
    boolean insertBook(Book b);

    boolean removeBook(Book b);

    Book searchBook(String isbn);

    void showAllBooks();

    // Default implementations
    default boolean insertBookDefault(Book[] books, Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                return true;
            }
        }
        return false;
    }

    default boolean removeBookDefault(Book[] books, Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == b) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    default Book searchBookDefault(Book[] books, String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    default void showAllBooksDefault(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("\n\n---------------------------------------------------------------");
                System.out.println("Showing details for Book at index " + i);
                System.out.println("ISBN: " + books[i].getIsbn());
                System.out.println("Book Title: " + books[i].getBookTitle());
                System.out.println("Author Name: " + books[i].getAuthorName());
                System.out.println("Price: " + books[i].getPrice());
                System.out.println("Available Quantity: " + books[i].getAvailableQuantity());
                System.out.println("---------------------------------------------------------------");
            }
        }
    }
}