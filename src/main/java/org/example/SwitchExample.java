package org.example;

public class SwitchExample {
    public static void main(String[] args) {
        String day="Mon";
        switch(day){
            case "Mon" :
                System.out.println("it is monday");
                break;
            case "TUES":
                System.out.println("it is tuesday");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}
