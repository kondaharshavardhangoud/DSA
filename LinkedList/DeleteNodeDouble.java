package LinkedList;

import java.util.*;
import LinkedList.DoubleNode;;

public class DeleteNodeDouble {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(12,2,4);
    DoubleNode head = new DoubleNode(list.get(0));
    DoubleNode prev = head; // storing head in prev so that we can add new data
    for(int i =1;i<list.size();i++){
        DoubleNode temp = new DoubleNode(list.get(i),prev,null);
        prev.next = temp;
        prev = temp;
        
    }
    System.out.println("Before Deleting ");
    printDouble(head);

    DoubleNode newHead= deleteData(head);
    System.out.println("After deleting");
    printDouble(newHead);

    System.out.println("Deleting at head");
    DoubleNode deleteHead = deleteNodeHead(newHead);
    printDouble(deleteHead);

    }

    private static DoubleNode deleteNodeHead(DoubleNode head){
         if(head==null || head.next==null) return null;
        DoubleNode temp = head;
        head = temp.next;
        head.prev = null;
        temp.next = null;//we made the deleted head isolated 
        return head;
    }
    private static DoubleNode deleteData(DoubleNode head) {
        if(head==null || head.next==null) return null;
        DoubleNode temp = head;
        while (temp.next.next!=null) {
           temp= temp.next;
        }
        temp.next = null;
        return head;
    }

    private static void printDouble(DoubleNode head) {
        System.out.print("null<->");
        while (head!=null) {
            System.out.print(head.data+"<->");
            head = head.next;
        }
         System.out.println("null");
    }
   
}

