package polymorphism;

public class Main{
    public static void main(String[] args) {
//        Student st=new Student();
//        st.read();
//        st.read("will get a job?");

Person person = new Emp();   //only by changing the object(Emp()) we can change the function calling
        person.ram();
    }
}
