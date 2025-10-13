package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumLL {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(1, 2, 4, 5, 6, 8, 9);
        DoubleNode head = new DoubleNode(lt.get(0));
        DoubleNode prev=head;
        for(int i=1;i<lt.size();i++){
            DoubleNode newNode = new DoubleNode(lt.get(i));
            prev.next = newNode;
            newNode.prev=prev;
            prev=newNode;
        }
        int target = 7;
        List<List<Integer>> list = pairOfSum(head,target);
        System.out.println(list);
    }

    private static List<List<Integer>> pairOfSum(DoubleNode head,int target) {
       List<Integer> lt = new ArrayList<>();
       while (head!=null) {
         lt.add(head.data);
         head=head.next;
       }
       List<List<Integer>> result = new ArrayList<>();
       int left =0;
       int right = lt.size()-1;
       while (left<right) {
        int res = lt.get(left)+lt.get(right);
        List<Integer> temp = new ArrayList<>();
            if(res==target){
                temp.add(lt.get(left));
                temp.add(lt.get(right));
                result.add(temp);
                left++;
                right--;
            }else if(res>target){
                right--;
            }else if(res<target){
                left++;
            }
       }
       return result;
    }
}
