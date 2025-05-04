public class BoxObject {
    int length, width, height;

    public BoxObject(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void display() {
        System.out.println("Box (L=" + length + ", W=" + width + ", H=" + height + ")");
    }

    public static void displayBoxes(BoxObject[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            System.out.print("Index " + i + ": ");
            if (boxes[i] != null) {
                boxes[i].display();
            } else {
                System.out.println("Empty");
            }
        }
    }

    public static void deleteBox(BoxObject[] boxes, int index) {
        if (index < 0 || index >= boxes.length) {
            System.out.println("Invalid index!");
            return;
        }
        if (boxes[index] == null) {
            System.out.println("Already empty!");
        } else {
            boxes[index] = null;
            System.out.println("Deleted at index " + index);
        }
    }

    public static void insertBox(BoxObject[] boxes, BoxObject newBox) {
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == null) {
                boxes[i] = newBox;
                System.out.println("Inserted at index " + i);
                return;
            }
        }
        System.out.println("Array full! Cannot insert.");
    }

    public static void main(String[] args) {
        BoxObject[] boxes = new BoxObject[3];

        // Insert Boxes
        insertBox(boxes, new BoxObject(5, 9, 12));
        insertBox(boxes, new BoxObject(8, 2, 50));
        insertBox(boxes, new BoxObject(3, 4, 6));

        System.out.println("\n--- After Insertion ---");
        displayBoxes(boxes);

        // Delete a box at index 1
        deleteBox(boxes, 1);

        System.out.println("\n--- After Deletion ---");
        displayBoxes(boxes);
    }
}