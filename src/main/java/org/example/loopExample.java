package org.example;

public class loopExample {
    public static void main(String[] args) {
        //print 1 to 10
        //FOR LOOP
        for (int i=1;i<=10;i++)
        {
            System.out.println(i+ " FOR ");
        }
        //WHILE LOOP
        int j=1;
        while(j<=10){
            System.out.println(j+ " WHILE ");
            j++;
        }

        //DO-WHILE LOOP
        int k=1;
        do {
            System.out.println(k+ " DO WHILE ");
            k++;
        }while (k<=10);
    }
}
