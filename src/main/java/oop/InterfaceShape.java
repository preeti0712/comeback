package oop;

public interface InterfaceShape {
    int a = 5;

    public void area(int r);

    public static void main(String[] args) {
        InterfaceShape is = new Circle();
        is.area(5);
    }

}
    class Circle implements InterfaceShape{
    public void area(int r){
        System.out.println("area of circle is "+Math.PI*r*r);
    }
}



