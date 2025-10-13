package LinkedList;

import java.util.Arrays;
import java.util.List;

public class NthElementFromLast {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,3,1,0,5);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        int k =2;
        int len = length(head);
        int res = len-k;
        Node newHead = toDeleteKthElement(head,res);
        printLL(newHead);
    }

    private static Node toDeleteKthElement(Node head, int res) {
        if (head == null) return null;

        if (res == 0) return head.next; 
        Node temp = head;
        int count=0;
        while (temp!=null && count< res-1) {
            count++;
            temp = temp.next;
        }
           if (temp!=null && temp.next!=null) {
           temp.next =temp.next.next;
        }
        return head;
    }

    private static int length(Node head) {
        int count =0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }
    private static void printLL(Node newHead) {
        while (newHead!=null) {
            System.out.print(newHead.data+"->");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}
