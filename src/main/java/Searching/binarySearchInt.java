package Searching;

public class binarySearchInt {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 8, 9};
        int li = 0;
        int hi = a.length - 1;
        int mid = (li + hi) / 2;
        int item = 7;
        while (li <= hi) {
            if (a[mid] == item) {
                System.out.println("item is at " + mid + " index position");
                break;
            } else if (a[mid] < item) {
                li = mid + 1;
            } else {
                hi = mid - 1;
            }
            mid = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("item not found in the sorted list.");
        }
    }
}
