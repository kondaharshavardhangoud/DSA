package LinkedList;

import LinkedList.Node;
import java.util.Arrays;
import java.util.List;

public class LengthOfLinkedList {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(10,2,4,1,0);
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));
        head.next.next.next.next = new Node(list.get(4));
        System.out.println(length(head));
    }

    private static int length(Node head) {
        int count =0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
