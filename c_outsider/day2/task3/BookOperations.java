public interface BookOperations {
    void addQuantity(int amount);

    void sellQuantity(int amount);

    // Default implementation for adding quantity
    default void addQuantityDefault(int amount, int availableQuantity) {
        if (amount >= 0) {
            availableQuantity += amount;
        } else {
            System.out.println("Negative amount detected! Book amount will reduce!");
            availableQuantity += amount;
        }
    }

    // Default implementation for selling quantity
    default void sellQuantityDefault(int amount, int availableQuantity) {
        if (availableQuantity >= 0) {
            availableQuantity -= amount;
        } else {
            System.out.println("Negative amount detected! Book amount will increase!");
            availableQuantity -= amount;
        }
    }
}