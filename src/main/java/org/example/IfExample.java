package org.example;

public class IfExample {
    public static void main(String[] args) {
        int n = 0;

        //IF CONDITION
        if (n>5){
            System.out.println("yes it is greater than 5");
        }
        //ELSE IF CONDITION
        if (n>5){
            //true block
            System.out.println("yes it is greater than 5");
        }
        else {
            //false block
            System.out.println("No it is not greater than 5");
        }

        // IF ELSE LADDER
        int marks = 78;
        if (marks > 90){
            System.out.println("grade A");
        } else if (marks>80 && marks<=90) {
            System.out.println("grade B");
        } else {
            System.out.println("Grade C");
        }
        // NESTED IF

    }
}