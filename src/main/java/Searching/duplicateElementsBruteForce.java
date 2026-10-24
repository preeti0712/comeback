package Searching;
//BRUTE FORCE METHOD.
public class duplicateElementsBruteForce {
    public static void main(String[] args) {
        // TIME CONSUMING
        // BAAR BAAR MATCH KAREGA(JAHAN DUPLICAY MORE THAN 2 HO WAHAN HUM ISKO USE NHI KARTE
        int[] a={2,3,5,6,2,8,7,5,2};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.println(a[j]+" is duplicate and present at "+(j+1)+ "th index" );
                }
            }
//            break;            //ONLY FOR FIRST DUPLICATE ELEMENT
        }
    }

}
