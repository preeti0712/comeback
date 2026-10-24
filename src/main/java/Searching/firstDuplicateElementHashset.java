package Searching;

import java.util.HashSet;

public class firstDuplicateElementHashset {
    public static void main(String[] args) {
//        int [] a={2,5,2,4,5,7,5,5,1,7};
        int [] a={6,5,5,3,1,2,4,4};

        int temp=-1;
        int i;
        HashSet <Integer> hs = new HashSet<>();
        for(i=(a.length-1);i>=0;i--){
            if(hs.contains(a[i])){
                temp=i;
            }else{
                hs.add(a[i]);
            }
        }
        if(temp != -1){
            System.out.println("duplicate element is "+a[temp]);
        }else{
            System.out.println("no duplicate element is found");
        }
    }
}
