package LinkedList;

import java.util.Arrays;
import java.util.List;

public class IntersectionLL {
    public static void main(String[] args) {
     Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(1);

        Node common = new Node(2);
        common.next = new Node(4);

        head1.next.next.next = common; // append common to list1

        Node head2 = new Node(3);
        head2.next = common;           // attach common to list2

        Node newHead = intersectionLL(head1,head2);
        if(newHead==null){
            System.out.println("null");
        }else{
            System.out.println(newHead.data);
        }
    }

    private static Node intersectionLL(Node head1, Node head2) {
        Node p1=head1;
        Node p2=head2;
       while (p1!=p2) {
            p1 = (p1==null)?head2:p1.next; // repeateadly loop after reaching null/end
            p2 =(p2==null)?head1:p2.next;
       }
       return p1;
    }
}
