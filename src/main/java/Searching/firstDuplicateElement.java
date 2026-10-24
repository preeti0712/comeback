package Searching;

public class firstDuplicateElement {
    public static void main(String[] args) {
        int[] a = {2,5, 3, 4, 4, 1, 5, 7, 8, 6};
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println("first duplicate number is " + a[i]);
                    temp = temp + 1;
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }
    }
}
