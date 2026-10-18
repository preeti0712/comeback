package exception;
public class ExceptionExample {
    public static void main(String[] args) {

        try {
            System.out.println("STARTING.....");
            int num1 = 60;
            int num2 = 10;
            System.out.println("Two numbers are : "+num1 +", " +num2);
            int result = num1 / num2;

            if (num2<=10)
            {
                throw new AgeInvalidException("Age entered is invalid");   //Exceptionally throwing exception
            }
            System.out.println("result is " + result);
        }catch (AgeInvalidException e){
            System.out.println("Invalid num2");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR!!!!!");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("This is finally block!!!!");
        }
        System.out.println("ENDING.......");

    }
}

