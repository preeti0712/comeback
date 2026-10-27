package Searching;

import java.util.HashSet;

public class longestConsLength {
    public static void main(String[] args) {
        int[] a = {2, 5, 3, 8, 90,91, 12,86,87, 88, 1,7,6,4, 89};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        int long_leng=0;
        for (int i = 0; i < a.length; i++) {
            if (!hs.contains(a[i] - 1)) {
                int no = a[i];
                while(hs.contains(no)){
                    no++;
                }
                if(long_leng < no-a[i]){
                    long_leng=no-a[i];
                }
            }
        }
        System.out.println("Longest sub sequence length is "+long_leng);
    }
}
