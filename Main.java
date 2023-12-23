public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        // adding elements to the list
        myList.addFirst(5);
        myList.addLast(10);
        myList.addFirst(3);
        myList.addLast(15);

        // displaying the list using toString()
        System.out.println("list elements: " + myList.toString());

        // displaying the first and last elements
        System.out.println("first element: " + myList.first());
        System.out.println("last element: " + myList.last());

        // displaying the size of the list
        System.out.println("size of the list: " + myList.size());

        // removing elements from the list
        System.out.println("removed first element: " + myList.removeFirst());
        System.out.println("removed last element: " + myList.removeLast());

        // displaying the updated list using toString()
        System.out.println("list elements after removal: " + myList.toString());

        // displaying the updated first and last elements
        System.out.println("first element after removal: " + myList.first());
        System.out.println("last element after removal: " + myList.last());

        // displaying the updated size of the list
        System.out.println("size of the list after removal: " + myList.size());

        // removing element at index 1
        System.out.println("removed element at index 1: " + myList.removeByIndex(1));

        // displaying the list after removing element at index 1
        System.out.println("list elements after removing index 1: " + myList.toString());
    }
}
