package LinkedList;


import java.util.*;
import LinkedList.DoubleNode;;
public class InsertToDoubleLinkedList {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(12,2,4);
    DoubleNode head = new DoubleNode(list.get(0));
    DoubleNode prev = head; // storing head in prev so that we can add new data
    for(int i =1;i<list.size();i++){
        DoubleNode temp = new DoubleNode(list.get(i),prev,null);
        prev.next = temp;
        prev = temp;
        
    }
    System.out.println("Before adding ");
    printDouble(head);
     
    int data =100;
    DoubleNode newHead= addData(head,data);
    System.out.println("After adding");
    printDouble(newHead);

    }

    private static DoubleNode addData(DoubleNode head, int data) {
        DoubleNode newData = new DoubleNode(data);
        DoubleNode temp = head;
        while (temp.next!=null) {
           temp= temp.next;
        }
        temp.next = newData;
        newData.prev=temp;
        return head;
    }

    private static void printDouble(DoubleNode head) {
        while (head!=null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
         System.out.println("null");
    }
   
}

