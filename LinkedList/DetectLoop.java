package LinkedList;
import LinkedList.Node;

public class DetectLoop {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        Node head = first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=second;

        boolean loopDetector = detectLoop(head);
        if(loopDetector==true){
            System.out.println("Loop Detected");
        }else{
            System.out.println("No loop found");
        }

        Node loopPoint = detectLoopStartPoint(head);
        System.out.println("At value :"+loopPoint.data);
        System.out.println(lengthOfLoop(head));
    }

    private static Node detectLoopStartPoint(Node head) {
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow = head; // reset slow to head and now start single step for slow
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;//return fast because both are at same
            }
       }
       return null;
    }


    private static int lengthOfLoop(Node head){
        Node slow = head;
       Node fast = head;
       int count=0;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count =1;
                // here slow and fast are equal so moving fast pointer a head
                fast = fast.next;
                while(slow!=fast){
                    fast=fast.next;
                    count++;
                }
                return count;
            }
       }
       return 0;
    }
    private static boolean detectLoop(Node head) {
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
       }
       return false;
    }
}
