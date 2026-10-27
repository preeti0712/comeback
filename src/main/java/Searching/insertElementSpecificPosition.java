package Searching;

public class insertElementSpecificPosition {
    public static void main(String[] args) {
        int [] a={2,4,6,8,0};
        int element= 5;
        int pos=3;//pos = 1,2,3,4--- and index_pos=0,1,2,3-----
        for(int i=(a.length-1);i>(pos-1);i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
