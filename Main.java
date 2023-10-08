public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.addLast("23");
        System.out.println(list.toString());
        list.addFirst("2");
        System.out.println(list.toString());
        list.addFirst("27");
        System.out.println(list.toString());
        list.addLast("33");
        System.out.println(list.toString());
        list.deleteByIndex(4);
        System.out.println(list.toString());
        list.deleteByIndex(1);
        System.out.println(list.toString());
        list.addFirst("1");
        System.out.println(list.toString());
        list.addLast("22");
        System.out.println(list.toString());
        list.addFirst("3");
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list.toString());
        list.removeFirst();
        System.out.println(list.toString());
    }
}
