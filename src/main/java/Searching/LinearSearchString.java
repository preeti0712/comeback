package Searching;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] a = {"ankit", "rohit", "preeti", "gaurav", "divisha", "girish", "khashti"};
        String item = "khashti";
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(item)) {
                System.out.println("@@@@@@@@@@@@item is present at " + i + " index position.@@@@@@@@@@@@");
                temp = temp + 1;
            }
        }
        if(temp==0){
            System.out.println("item not found in the list.");
        }
    }
}
