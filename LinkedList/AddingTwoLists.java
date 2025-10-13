package LinkedList;

public class AddingTwoLists {
    public static void main(String[] args) {
        Node list1 = new Node(9);
        list1.next =new Node(9);
        list1.next.next =new Node(9);

        Node list2 = new Node(9);
        list2.next =new Node(9);
        list2.next.next =new Node(9);
        Node l1= reverse(list1);
        Node l2= reverse(list2);
        Node newHead = addTwoNodes(l1,l2);
        Node original = reverse(newHead);
        printLL(original);
     //   int num1 = toNumber(list1);
    //    int num2 = toNumber(list2);
      //  int res = num1+num2;
        // String st = String.valueOf(res);
        // Node newList = new Node(-1);
        // Node dummy = newList;
        //     for(int i=0;i<st.length();i++){
        //         dummy.next=new Node(Character.getNumericValue(st.charAt(i)));
        //         dummy=dummy.next;
        //     }
      //  printLL(newList.next);

    }

    private static Node reverse(Node list1) {
        if(list1==null || list1.next==null) return list1;
        Node newHNode = reverse(list1.next);
        list1.next.next=list1;
        list1.next=null;
        return newHNode;
    }

    private static Node addTwoNodes(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2; 
        int carry =0;
        Node res = new Node(-1);
        Node dummy = res;
        while (temp1!=null || temp2!=null) {
            if(temp1!=null){
                carry+=temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null){
                carry+=temp2.data;
                temp2=temp2.next;
            }
            dummy.next = new Node(carry%10);
            carry = carry/10;
            dummy=dummy.next;
        }
        if(carry>0){
            dummy.next =new Node(carry);
        }
        return res.next;
    }

     // private static int toNumber(Node list1) {
    //     StringBuilder sb = new StringBuilder();
    //     while (list1!=null) {
    //         sb.append(list1.data);
    //         list1=list1.next;
    //     }
    //     return Integer.parseInt(sb.toString());
    // }
     private static void printLL(Node newNode) {
        while (newNode!=null) {
            System.out.print(newNode.data+"->");
            newNode=newNode.next;
        }
        System.out.println("null");
    }
}
