package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLL {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,1,0,5,9);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        Node newNode = sortLL(head);
        printLL(newNode);
    }

    private static void printLL(Node newNode) {
        while (newNode!=null) {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }

    // private static Node sortLL(Node head) {
    //     Node temp = head;
    //   List<Integer> list = new ArrayList<>();
    //   while(temp!=null){
    //     list.add(temp.data);
    //     temp=temp.next;
    //   }
    //   Collections.sort(list);
    //   Node temp1=head;
    //   for(int i=0;i<list.size();i++){
    //      temp1.data=list.get(i);
    //      temp1 = temp1.next;
    //   }
    //   return head;
    // }

    // using merge optimized way
   public static Node sortLL(Node head){
        if(head==null || head.next==null){
            return head; //because they are single element which sorted
        }

        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next=null;

        Node left = sortLL(head);
        right = sortLL(right);

        Node newNode = mergeTheSortedList(left,right);
        return newNode;
    }

    private static Node mergeTheSortedList(Node left, Node right) {
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        while (left!=null && right!=null) {
            if(left.data<=right.data){
                temp.next =left;
                left = left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp = temp.next;
        }
        while (left!=null) {
            temp.next =left;
            left = left.next;
        }
        while (right!=null) {
             temp.next=right;
            right=right.next;
        }
        return dummyHead.next;
    }

    private static Node findMiddle(Node head) {
       Node slow = head;
       // normally to find the second middle of even this is ok
      // Node fast = head;
      // for the sorting we need first middle
       Node fast = head.next;
       while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast =fast.next.next;
       }
       return slow;
    }
}
