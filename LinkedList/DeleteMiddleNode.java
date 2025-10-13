package LinkedList;

import java.util.Arrays;
import java.util.List;

public class DeleteMiddleNode {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(10,2,1,0,5,9);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        Node newHead = deleteMiddle(head);
        printLL(newHead);
    }
    private static Node deleteMiddle(Node head) {
        if(head == null || head.next==null) return null;
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    private static void printLL(Node newHead) {
        while (newHead!=null) {
            System.out.print(newHead.data+"->");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
