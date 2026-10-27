package Searching;

public class commonElementsTwoArrays {
    public static void main(String[] args) {
        int [] arr1={1,6,2,8,3,9};
        int [] arr2={7,0,4,6,5,9,1};
        System.out.println("Common elements are ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]== arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
