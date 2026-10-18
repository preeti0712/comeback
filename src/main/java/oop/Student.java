package oop;

public class Student {
    int studentId;
    String studentName;
    String studentCity;

    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void study(int i)            //method overloading
    {
        System.out.println("i"+i);
    }

    public void studentDetails() {
        System.out.println("Details are " + studentId + " " + studentName + " " + studentCity);
    }

    public Student() {           //Default/non-parameterized constructor
        System.out.println("non-parameterized/default constructor");
    }

    public Student(int i) {
        System.out.println("student id is " + i);
    }   //parameterized constructor

    public Student(int i, String j, String k) {         //parameterized constructor
        studentId = i;
        studentName = j;
        studentCity = k;
    }
}
