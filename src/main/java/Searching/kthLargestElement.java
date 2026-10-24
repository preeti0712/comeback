package Searching;

public class kthLargestElement {
    public static void main(String[] args) {
        int[] a={12,34,56,78,90,94,62,31,1};
        int temp;
        int k=1;                            //nth element to be searched
        for(int i=0;i<(a.length-1);i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==(k-1)){
                System.out.println(k+"th largest element is "+a[i]);
                break;
            }
        }
        System.out.println("----------------------------------------------");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
