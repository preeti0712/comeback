package oop;

//INHERITANCE
public class Animal {
    String color = "BLUE";
    int x = 9;

    public void eat() {
        System.out.println("is eating");
    }


    static class Dog extends Animal {
        int x = 1;
        public void speak(){
            System.out.println(super.x);        //SUPER KEYWORD
            System.out.println(this.x);
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.eat();
        d.speak();
        System.out.println(d.color);
    }
}
