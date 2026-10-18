package polymorphism;

public class Student {

    public void read()
    {
        System.out.println("reading this book");        //Run time polymorph
    }
    public void read(String bookName)
    {
        System.out.println("Reading book "+bookName);       //run time polymorph
    }
}

