package Searching;

public class linearSearchInt {
    public static void main(String[] args) {
        int [] a={8,7,4,1,9,2};
        int item = 18;
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==item){
                System.out.println("********item is present at "+i+ " index position.*******");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item not found in the list");
        }
    }
}
