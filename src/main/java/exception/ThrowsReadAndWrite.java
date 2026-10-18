package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsReadAndWrite {
    void ReadFile() throws FileNotFoundException        //throws used only with checked exception
    {
        FileInputStream fis = new FileInputStream("C:/Test.java");
    }
    void SaveFile() throws FileNotFoundException
    {
        System.out.println("this is testing");      //throws used only with checked exception
        FileOutputStream fos = new FileOutputStream("C:/Test.java");
    }
}

class Test {
    public static void main(String[] args) {
        ThrowsReadAndWrite trw = new ThrowsReadAndWrite();
        try {
            trw.ReadFile();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        try {
            trw.SaveFile();
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }
        System.out.println("this is the end");
    }
}
