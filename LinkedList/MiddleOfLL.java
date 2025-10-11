package LinkedList;

import java.util.Arrays;
import java.util.List;

import LinkedList.Node;
public class MiddleOfLL {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,1,0,4);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
       Node middle = findMiddleNode(head);
        System.out.println("Middle node data: " + middle.data);
    }

    private static Node findMiddleNode(Node head) {
        Node slow=head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     
}
