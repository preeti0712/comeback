package org.example;

public class array2d {
    public static void main(String[] args) {
        int[][] a = {{10, 20, 30, 40}, {50, 60}, {70, 80, 90}};

//        System.out.println(a);                o/p [[I@class value
//        System.out.println(a[0][0]);          o/p  10
//        System.out.println(a.length);         o/p  3
//        System.out.println(a[0].length);         o/p  4
        //  System.out.println(a[0][0].length);     o/p = compile time error

        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a[i].length); j++) {
                System.out.println(a[i][j] + ",");
            }
            System.out.println();
        }

    }
}