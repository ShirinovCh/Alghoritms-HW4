package linkedList;

public class ListApp {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert("Василий", 18);
        list.insert("Игорь", 20);
        list.insert("Антон", 22);
        list.display();
        System.out.println();
        if (!list.isEmpty()) list.delete();
        list.display();
    }
}
