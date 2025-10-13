package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLLof012 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,2,1,0,2,1);
        Node head = new Node(list.get(0));
        Node temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        Node newHead = sort012(head);
        printLL(newHead);
    }
    //  private static Node sort012(Node head) {
    //     Node temp = head;
    //     List<Integer> list = new ArrayList<>();
    //     while (temp!=null) {
    //         list.add(temp.data);
    //         temp=temp.next;
    //     }
    //     Collections.sort(list);
    //     Node temp1=head;
    //     int i=0;
    //     while (temp1!=null) {
    //         temp1.data=list.get(i++);
    //         temp1=temp1.next;
    //     }
    //     return head;
    // }

    //now to use three links
    private static Node sort012(Node head) {
        Node demo0Head = new Node(-1);
        Node demo0 = demo0Head;
        Node demo1Head = new Node(-1);
        Node demo1 = demo1Head;
        Node demo2Head = new Node(-1);
        Node demo2 = demo2Head;
        while (head!=null) {
            if(head.data==0){
                demo0.next = head;
                demo0 =demo0.next;
            }else if(head.data==1){
                demo1.next =head;
                demo1 =demo1.next;
            }else{
                demo2.next =head;
                demo2 =demo2.next;
            }
            head=head.next;
        }
       
        demo0.next = demo1Head.next;
        demo1.next = demo2Head.next;
        demo2.next =null;
        return demo0Head.next;
    }
     private static void printLL(Node newNode) {
        while (newNode!=null) {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }
    
}
