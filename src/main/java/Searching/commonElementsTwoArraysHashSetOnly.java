package Searching;

import java.util.HashSet;

public class commonElementsTwoArraysHashSetOnly {
    public static void main(String[] args) {
        int [] arr1={1,1,6,2,8,3,9,1};
        int [] arr2={7,1,0,4,6,5,9,1};
        System.out.println("Common elements are ");

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int no : arr1){
            hs1.add(no);
        }
        for(int no :arr2){
            hs2.add(no);
        }
        for(int no : hs2){
            Boolean b = hs1.add(no);
            if(b==false){
                System.out.println(no);

            }
        }
    }
}
