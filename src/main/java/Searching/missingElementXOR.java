package Searching;

public class missingElementXOR {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int XOR = a[0];
        for (int i = 1; i < a.length; i++) {
            XOR = XOR ^ a[i];
        }
        int XOR2 = 1;
        for (int i = 2; i <= a.length + 1; i++) {
            XOR2 = XOR2 ^ i;
        }

        System.out.println("missing element is " + (XOR ^ XOR2));
    }
}
