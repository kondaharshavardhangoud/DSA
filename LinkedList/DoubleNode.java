package LinkedList;

public class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int data,DoubleNode prev,DoubleNode next){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    DoubleNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
