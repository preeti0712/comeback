package Searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateElementHashtable {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 3, 6, 8, 6, 1};
        //create hm through MAP
        Map<Integer, Integer> hm = new HashMap<>();
        for (int no : a) {
            Integer count = hm.get(no);         //get no.in the form of integer
            if (count == null) {
                hm.put(no, 1);
            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }
        //to print elements
        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        for (Map.Entry<Integer, Integer> me : es) {
            if (me.getValue() > 1) {
                System.out.println("-----------" + me.getKey());
            }
        }

    }
}
