public class Main {
    public static Node head = null;
    public static void main(String[] args) {
        Node node0 = new Node("Finn Leonard");
        Node node1 = new Node("Billy Lardner");
        Node node2 = new Node("Louis Hoad");
        Node node3 = new Node("Oscar Moores");
        Node node4 = new Node("Zac Wilkes-Green");
        Node node5 = new Node("Juan Guerrero");

        head = node0;
        node0.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;

        Print();

        AddEnd("Jude Brooker");

        Print();

        AddStart("Jude Brooker");

        Print();

        RemoveStart();

        Print();

        RemoveEnd();

        Print();
    }

    public static void Print() {
        if (head == null) {
            System.out.println("List is empty - no one came to class");
        } else {
            Node currentNode = head;
            while (currentNode.nextNode != null) {
                System.out.println(currentNode.studentName);
                currentNode = currentNode.nextNode;
            }
            System.out.println(currentNode.studentName);
            System.out.println("\n");
        }
    }

    public static void AddEnd(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
    }

    public static void AddStart(String value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.nextNode = head;
        }
        head = newNode;
    }

    public static void RemoveStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.nextNode;
        }
    }

    public static void RemoveEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currentNode = head;
            Node previousNode = null;
            while (currentNode.nextNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            if (previousNode == null) {
                head = null;
            } else {
                previousNode.nextNode = null;
            }
        }
    }
}
