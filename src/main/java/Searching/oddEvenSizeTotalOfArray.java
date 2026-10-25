package Searching;

import java.util.ArrayList;

public class oddEvenSizeTotalOfArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 5, 8, 9, 5, 4, 6};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }
        int total1=0;
        System.out.println("Even numbers are: ");
        for (int no : al1){
            total1=total1+no;
            System.out.print(no+" ");
        }
        System.out.println("total is "+total1);

        System.out.println("Odd numbers are");
        int total2=0;
        for(int no :al2){
            total2=total2+no;
            System.out.print(no+" ");
        }
        System.out.println("total is "+total2);

    }
}
