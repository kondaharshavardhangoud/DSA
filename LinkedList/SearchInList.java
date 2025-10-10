package LinkedList;

import java.util.Arrays;
import java.util.List;

import LinkedList.Node;
public class SearchInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,1,0);
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));
        head.next.next.next.next = new Node(list.get(4));
        int k=1;
        int l =11;
        System.out.println(find(head,k)); // TRUE
        System.out.println(find(head,l)); // FALSE
    }

    private static boolean find(Node head, int k) {
       while (head!=null) {
           if(head.data==k) return true;
           else head=head.next;
       }
       return false;
    }
}
