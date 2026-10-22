package Searching;

public class maxMin {
    public static void main(String[] args) {
        int [] a={4,76,45,12,8,90};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max value is "+max);

        for(int j=0;j<a.length;j++){
           if(a[j]<min) {
               min=a[j];
           }
        }
        System.out.println("min value is "+min);
    }
}
