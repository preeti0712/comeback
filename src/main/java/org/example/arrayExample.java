package org.example;

public class arrayExample {
    public static void main(String[] args) {
        int num[]={12,13,14,15};
        int s=0;
        for(int i:num){
            s=s+i;
        }
        System.out.println("sum is "+s);
    }
}
