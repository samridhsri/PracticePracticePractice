package linkedListCode;

import javax.sound.sampled.Line;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    static LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);

        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }

            last.next = new_node;
        }

        return list;

    }

    static LinkedList removeNode(LinkedList list, int key){
        Node curr_node = list.head;
        Node prev = null;

        //check if head is the key
        if(curr_node!=null && curr_node.data==key){
            list.head = list.head.next;
            System.out.println("Found and deleted at head!");
            return list;
        }

        //if head is not the key
        while(curr_node!=null && curr_node.data!=key){
            prev = curr_node;
            curr_node = curr_node.next;
        }

        if(curr_node!=null) {
            prev.next = curr_node.next;
            System.out.println("Found and Deleted!");
            return list;
        }

        System.out.println("No key was found!");
        return list;
    }

    static void printList(LinkedList list){
        Node curr_node = list.head;
        if(curr_node == null){
            System.out.println("Empty List");
        }
        else{
            while(curr_node!=null){
                System.out.print(curr_node.data + " ");
                curr_node = curr_node.next;
            }
            System.out.println(" ");
        }
    }

    static void recursivePrint(Node head){
        if(head==null){
            System.out.println(" ");
            return;
        }
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }

    public static void main(String[] args) {
        LinkedList test_list = new LinkedList();
        insert(test_list, 5);
        insert(test_list, 6);
        insert(test_list, 9);
        insert(test_list, 2);

        printList(test_list);

        removeNode(test_list, 6);

        printList(test_list);
        recursivePrint(test_list.head);

    }
}
