package LinkedList;

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int date,Node next){
        this.data = date;
        this.next = next;
    }
    Node(int date){
        this.data = date;
        this.next = null;
    }
}

public class InsertAtStart {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,3,2,6,9);
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));
        head.next.next.next.next = new Node(list.get(4));

        int val =100;
        head = insertHead(head,val);
        printLL(head);

    }
    public static void printLL(Node head){
        while (head.next!=null) {
            System.out.print(head.data+" ");
           head = head.next;
        }
        System.out.print(head.data);
    }

    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val,head);
        return temp;
    }
}
