package Searching;

public class secondLargest {
    public static void main(String[] args) {
        int[] a={23,45,65,12,98,67,88};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");       //decending order of array
        }
        System.out.println("second largest element in the provided array is "+a[1]);
//        System.out.println("second smallest element in the provided array is "+a[1]);

    }
}
