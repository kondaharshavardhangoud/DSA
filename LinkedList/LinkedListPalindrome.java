package LinkedList;

import java.util.Arrays;
import java.util.List;
import LinkedList.Node;

public class LinkedListPalindrome {
    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3,3,2,1);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
       boolean toCheckMiddle = isPalindrome(head);
       System.out.println(toCheckMiddle);
    }

    private static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         Node middleNode = reverseLL(slow.next);

        Node start = head;
        Node middle = middleNode;
        while (middle!=null) {
            if(start.data!=middle.data){
                return false;
            }
            middle=middle.next;
            start = start.next;
        }
        return true;
    }

    private static Node reverseLL(Node head) {
        if(head == null || head.next==null){
            return head;
        }
        Node newHead = reverseLL(head.next);
        Node front = head.next;
        head.next =null;
        front.next=head;
        return newHead;
    } 
}
