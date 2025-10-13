package LinkedList;

public class DeleteTarget {
    public static void main(String[] args) {
        DoubleNode first = new DoubleNode(1);
        DoubleNode second = new DoubleNode(2);
        DoubleNode third = new DoubleNode(3);
        DoubleNode fourth = new DoubleNode(1);
        DoubleNode fifth = new DoubleNode(6);
        DoubleNode sixth = new DoubleNode(11);

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
        int target =1;
           printLL(first);
        DoubleNode newHead = afterDeleting(first,target);
     
        System.out.println("After");
        printLL(newHead);

    }
    private static DoubleNode afterDeleting(DoubleNode first,int target) {
        DoubleNode temp = first;
        while(temp!=null){
            if(temp.data==target){
                if(temp.prev==null){
                    first=temp.next;
                    if (first != null) first.prev = null;
                    temp=first;
                }else if(temp.next==null){
                     temp.prev.next=temp.next;
                     temp=null;
                }else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    temp=temp.next;
                }
            }else{
                temp=temp.next;
            }
            
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
