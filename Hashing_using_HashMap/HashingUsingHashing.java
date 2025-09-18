package Hashing_using_HashMap;
import java.util.HashMap;

import java.util.Scanner;

public class HashingUsingHashing {
    private static void hasing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(hm.containsKey(key)){
                freq = hm.get(key);
            }
            freq++;
            hm.put(key, freq);
        }

        System.out.println("Enter the Query size");
        int num2 = sc.nextInt();
        while(num2-->0){
            System.out.println("Enter the Query number");
            int num3 = sc.nextInt();
            if(hm.containsKey(num3)){
                System.out.println(hm.get(num3));
            }else{
                System.out.println(0);
            }
        }
    }
    public static void main(String[] args) {
        hasing();
    }
}
