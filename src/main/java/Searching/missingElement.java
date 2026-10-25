package Searching;

public class missingElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,9};
        int expected_elements = a.length+1;
        int total_sum=(expected_elements*(expected_elements+1))/2;
        System.out.println("========total sum is "+total_sum);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("=========missing element is " + (total_sum-sum));
    }
}
