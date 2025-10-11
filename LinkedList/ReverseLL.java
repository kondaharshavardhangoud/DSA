package LinkedList;

import java.util.Arrays;
import java.util.List;

import LinkedList.Node;
public class ReverseLL {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,1,0,4);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
       Node reverseHead = reverseLL(head);
       printLL(reverseHead);
    }

    private static Node reverseLL(Node head) {
        Node temp =null;
        Node current = head;
        while(current!=null){
            Node link = current.next;
            current.next = temp;
            temp=current;
            current = link;
        }
        return temp;
    }
    public static void printLL(Node head){
        while (head!=null) {
            System.out.print(head.data+"->");
           head = head.next;
        }
        System.out.println("null");
    }
}
