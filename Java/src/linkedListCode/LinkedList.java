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
        }
    }

    public static void main(String[] args) {
        LinkedList test_list = new LinkedList();
        insert(test_list, 5);
        insert(test_list, 6);
        insert(test_list, 9);
        insert(test_list, 2);

        printList(test_list);

    }
}
