package exception;

public class AgeInvalidException extends Exception{
    AgeInvalidException() {
        super("Age is invalid");
    }
    AgeInvalidException(String message){
        super(message);
    }

//    AgeInvalidException aie = new AgeInvalidException();

}
