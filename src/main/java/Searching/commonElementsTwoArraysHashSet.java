package Searching;

import java.util.HashSet;

public class commonElementsTwoArraysHashSet {
    public static void main(String[] args) {
        int [] arr1={1,6,7,7,2,8,3,9,1};
        int [] arr2={0,7,7,4,6,5,9,1};
        System.out.println("Common elements are ");
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    hs.add(arr1[i]);
                    break;
                }
            }
        }
        for(int no:hs){
            System.out.println(no);
        }
    }
}
