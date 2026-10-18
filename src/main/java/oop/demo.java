package oop;

public class demo {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId=1;
        st1.studentName="Preeti";
        st1.studentCity="Delhi";
            st1.study();
            st1.studentDetails();

            Student st2=new Student(2,"Gaurav","BSES");    //object of student class created
//            st2.studentId=2;
//            st2.studentName="Rohit";
//            st2.studentCity="Uttarakhand";
            st2.study();
            st2.studentDetails();

            Student st3=new Student(5);


    }


}
