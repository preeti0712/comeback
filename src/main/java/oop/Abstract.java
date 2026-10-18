package oop;

abstract public class Abstract {
    public void cal() {
        System.out.println("complete method");
    }

    abstract public void rocket();

        public static void main(String[] args) {
//            AbstractChild abc = new AbstractChild();
//            abc.rocket();
//            abc.cal();

            Abstract ab=new AbstractChild();
            ab.rocket();
            ab.cal();

        }
    }

