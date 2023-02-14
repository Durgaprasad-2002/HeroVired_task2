import java.util.Scanner;

class NodeN {
    int data;
    NodeN next;

    NodeN(int data) {
        this.data = data;
    }
}

class LinkedList2 {
    NodeN head;
    int size;

    LinkedList2() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }

    void appendNodeBack(int data) {
        NodeN currentNode = new NodeN(data);

        if (isEmpty() == true) {
            this.head = currentNode;
        } else {
            NodeN prev = this.head;
            while (prev.next != null) {
                if (prev.data == currentNode.data)
                    break;
                prev = prev.next;
            }
            if (prev.data != currentNode.data)
                prev.next = currentNode;
        }
        this.size++;
    }

    void appendFront(int data) {
        NodeN newNode = new NodeN(data);

        if (isEmpty() == true) {
            this.head = newNode;
        } else {
            NodeN temp = this.head;
            this.head = newNode;
            this.head.next = temp;
        }
        this.size++;
    }

    void printData() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
        } else {
            NodeN currentNode = this.head;
            String listValues = "";
            while (currentNode != null) {
                listValues += String.valueOf(currentNode.data);
                listValues += "->";
                currentNode = currentNode.next;
            }
            System.out.println(listValues);
        }
    }
}

public class RemoveDuplicatesLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList2 studentIDLinkedList = new LinkedList2();
        studentIDLinkedList.appendFront(2);
        studentIDLinkedList.appendFront(5);
        studentIDLinkedList.appendFront(12);
        studentIDLinkedList.appendFront(2);
        studentIDLinkedList.appendFront(3);
        studentIDLinkedList.appendFront(5);
        studentIDLinkedList.appendFront(1);
        studentIDLinkedList.appendFront(2);
        studentIDLinkedList.appendFront(5);
        studentIDLinkedList.appendFront(5);
        studentIDLinkedList.printData();
    }
}