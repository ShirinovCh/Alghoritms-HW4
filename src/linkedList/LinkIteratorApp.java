package linkedList;

public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);

        iter.insertAfter("Artem",22);
        iter.insertBefore("Denis",21);
    }
}
