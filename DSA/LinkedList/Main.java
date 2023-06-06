package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        // System.out.println(list.contains(40));
    }

}
