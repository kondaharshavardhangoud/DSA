package LinkedList;

public class AddOneToList {
    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next=new Node(9);

        Node reverseHead = reverse(head);
        Node curr = reverseHead; // working with curr not altering reverseHead
        Node prev = null;
        int carry =1;
        while (curr!=null && carry>0) {
            carry +=curr.data;
            curr.data = carry%10;
            carry = carry/10;
            prev = curr;// because after loop ,ends at end it end at null so storing the point before null
            curr=curr.next; // at end it is null and condition gets false
        }
        if(carry>0){
            Node newCarry = new Node(carry);
            prev.next=newCarry; // the stored last node used to join the carry
        }
        Node original = reverse(reverseHead);
        printLL(original);
    }

    private static Node reverse(Node head) {
        if(head==null || head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next=head; // head.next = front and front.next = head
        head.next = null;

        return newHead;
    }
     private static void printLL(Node newNode) {
        while (newNode!=null) {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }
}
