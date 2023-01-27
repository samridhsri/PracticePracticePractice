package linkedListCode;

import java.util.List;

public class mergeSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode curr_node1 = list1;
//        ListNode curr_node2 = list2;
//        ListNode sorted = new ListNode();
//        ListNode sorted_head = sorted;
//
//        while(curr_node1!=null && curr_node2!=null){
//            if(curr_node1.val<curr_node2.val){
//                sorted.next = curr_node1;
//                sorted = sorted.next;
//                curr_node1 = curr_node1.next;
//            }
//            if(curr_node1.val == curr_node2.val){
//                sorted.next = curr_node1;
//                sorted = sorted.next;
//                curr_node1 = curr_node1.next;
//                sorted.next = curr_node2;
//                sorted = sorted.next;
//                curr_node2 = curr_node2.next;
//            }
//            if(curr_node1.val>curr_node2.val){
//                sorted.next = curr_node2;
//                sorted = sorted.next;
//                curr_node2 = curr_node2.next;
//            }
//        }
//
//        while(curr_node1!=null){
//            sorted.next = curr_node1;
//            sorted = sorted.next;
//            curr_node1 = curr_node1.next;
//        }
//
//        while(curr_node2!=null){
//            sorted.next = curr_node2;
//            sorted = sorted.next;
//            curr_node2 = curr_node2.next;
//        }
//
//        return sorted_head.next;
//    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr_node1 = list1;
        ListNode curr_node2 = list2;
        ListNode head = new ListNode(0);
        ListNode sorted = head;

        if(list1==null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        while(curr_node1!=null && curr_node2!=null){
            if(curr_node1.val < curr_node2.val){
                sorted.next = curr_node1;
                sorted = sorted.next;
                curr_node1 = curr_node1.next;
            } else if (curr_node1.val==curr_node2.val) {
                sorted.next =curr_node2;
                sorted = sorted.next;
                curr_node2 = curr_node2.next;

            } else{
                sorted.next = curr_node2;
                sorted = sorted.next;
                curr_node2 = curr_node2.next;

            }
        }

        if(curr_node1!=null){
            sorted = curr_node1;
            sorted = sorted.next;
        }
        if(curr_node2!=null){
            sorted = curr_node2;
            sorted = sorted.next;
        }

        return head.next;
    }

    static void printList(ListNode list){
        ListNode curr_node = list;
        if(curr_node == null){
            System.out.println("Empty List");
        }
        else{
            while(curr_node!=null){
                System.out.print(curr_node.val + " ");
                curr_node = curr_node.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;

        m1.next = m2;
        m2.next = m3;

        printList(l1);
        printList(m1);

        ListNode merged_list = mergeTwoLists(l1,m1);

        printList(merged_list);




    }
}
