package linkedListCode;

public class DoublyLinkedList {

    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }

    static void insertAtBeginning(DoublyLinkedList list, int d){
        Node new_node = new Node(d);
        if(list.head==null){
            list.head = new_node;
            new_node.next = null;
        }
        else{
            new_node.next = list.head;
            new_node.prev = null;
            list.head = new_node;
        }

    }

    static void insertAtEnd(DoublyLinkedList list, int d){
        Node new_node = new Node(d);
        Node curr_node = list.head;

        while(curr_node.next!=null){
            curr_node = curr_node.next;
        }

        curr_node.next = new_node;
        new_node.next = null;
        new_node.prev = curr_node;
    }

    static void printDLL(DoublyLinkedList list){
        Node curr_node = list.head;
        while(curr_node!=null){
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        DoublyLinkedList test_list = new DoublyLinkedList();
        insertAtBeginning(test_list, 5);
        insertAtBeginning(test_list, 6);
        insertAtBeginning(test_list, 7);
        insertAtBeginning(test_list, 8);

        insertAtEnd(test_list, 10);

        printDLL(test_list);

    }

}
