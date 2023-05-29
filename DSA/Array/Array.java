package Array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if the array is full, resize it
        if (items.length == count) {
            // Create a new array(twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
                // Set "items" to this new array
                items = newItems;
            }
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
            count--;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
