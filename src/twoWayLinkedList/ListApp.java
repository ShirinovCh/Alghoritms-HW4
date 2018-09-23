package twoWayLinkedList;

public class ListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Елена", 22);
        list.insertFirst("Анна", 33);
        list.insertFirst("Анастасия", 20);
        list.insertLast("Ярослав", 31);
        System.out.println("Выводим список людей");
        
        list.display();
        System.out.println("Удаляем человека");
        list.delete();
        System.out.println("Выводим список людей");
        list.display();
        System.out.println("Удаляем конкретного человека человека");
        list.delete("Ярослав");
        System.out.println("Выводим список людей");
        list.display();

    }
}
