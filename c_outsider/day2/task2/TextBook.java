public class TextBook extends Book {
	private String standard;

	public TextBook() {
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
			String standard) {
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard = standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStandard() {
		return standard;
	}
}