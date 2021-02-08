import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("C");

        ll.addFirst("A");
        ll.add(1, "A2");

        ll.remove("F");
        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Is the list empty? " + ll.isEmpty());
        System.out.println("ll after changes: " + ll);

    }

    public static void Greeting(String name) {
        
    }
}
