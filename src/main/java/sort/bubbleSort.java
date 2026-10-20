package sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {50, 20, 80, 11, 6,90,65,34,98,1,27,199};
        int temp;
        for (int i = 0; i < a.length; i++) {
//            int flag = 0;
            for (int j = 0; j < (a.length - 1); j++) {          //(a.length - 1-i) for less time consump. it will freez last element
                if (a[j] > a[j + 1]) {                  //if multiple strings are given then change ((a[i].compareTo(a[j+1])>0)
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
//                    flag = 1;
                }


            }
//            if (flag == 0)
//                break;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
