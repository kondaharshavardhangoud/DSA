package LinkedList;

public class DeleteDuplicate {
    public static void main(String[] args) {
        DoubleNode first = new DoubleNode(1);
        DoubleNode second = new DoubleNode(1);
        DoubleNode third = new DoubleNode(2);
        DoubleNode fourth = new DoubleNode(2);
        DoubleNode fifth = new DoubleNode(3);
        DoubleNode sixth = new DoubleNode(5);

        first.next =second;
        second.next=third;
        second.prev=first;
        third.next=fourth;
        third.prev=second;
        fourth.next=fifth;
        fourth.prev=third;
        fifth.next=sixth;
        fifth.prev=fourth;
        sixth.prev=fifth;

        printLL(first);
        DoubleNode newHead = deleteDuplicate(first);
        printLL(newHead);
        
    }
    private static DoubleNode deleteDuplicate(DoubleNode first) {
       DoubleNode temp = first;
       
    //    while(temp!=null){
    //     DoubleNode temp1= temp.next;
    //     while (temp1!=null) {
    //         if(temp.data==temp1.data){
    //             if(temp1.next!=null){
    //                 temp1.next.prev=temp1.prev;
    //                 temp1.prev.next=temp1.next;
    //             }
    //     }
    //     temp1=temp1.next;
    //     }
    //     temp =temp.next;
    //    }
    while (temp!=null) {
        DoubleNode nextDist = temp.next;
        while (nextDist!=null && nextDist.data==temp.data) {
            nextDist=nextDist.next;
        }
        temp.next=nextDist;
        if(nextDist!=null){
            nextDist.prev=temp;
        }
        temp=temp.next;
    }
       return first;
    }
    private static void printLL(DoubleNode newNode) {
        while (newNode!=null) {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }
}
