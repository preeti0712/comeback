package Searching;

public class elementAppearOnce {
    public static void main(String[] args) {
        int [] a={5,4,3,2,5,4,3,2};
        int res=a[0];
        for(int i=1;i<a.length;i++){
            res=res^a[i];
        }
        System.out.println("==============Element that appeared once is "+res);
    }
}
