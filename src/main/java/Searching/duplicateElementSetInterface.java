package Searching;
//SET INTEFACE METHOD
import java.util.HashSet;
import java.util.Set;

public class duplicateElementSetInterface {
    public static void main(String[] args) {
        // BAAR BAAR MATCH KAREGA(JAHAN DUPLICAY MORE THAN 2 HO WAHAN HUM ISKO USE NHI KARTE

        int[] a = {6, 4, 2, 7, 8, 5, 2, 4, 2};
        Set<Integer> s = new HashSet<>();
        for(int no:a)
            if(s.add(no) == false ){
                System.out.println(no+" ");
            }

    }
}
