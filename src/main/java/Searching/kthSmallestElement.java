package Searching;

public class kthSmallestElement {
    public static void main(String[] args) {
        int []a ={23,45,75,91,3,56,8,0};
        int temp;
        int k=4;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==(k-1)){
                System.out.println(k+"th smallest element is "+a[i]);
                break;
            }
        }
        System.out.println("----------------------------------");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
