package oop;

public class MethodOverridding {
    public void m1() {
        System.out.println("parent m1()");
    }

    public static void main(String[] args) {
        MethodOverridding2 m2 = new MethodOverridding2();
        m2.m1();
    }
}

class MethodOverridding2 extends MethodOverridding {
    public void m1() {              //method overriding
        System.out.println("child m1()");
    }
}