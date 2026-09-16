import java.io.IOException;


public class Exceptionn {

    public static void main(String[] args) {
        try{
         throw new ExceptionA("exception A occur");
        }
        catch(Exception exception){
            System.err.println(exception.getMessage());
        }

          try{
         throw new ExceptionB("exception B occur");
        }
        catch(Exception exception){
            System.err.println(exception.getMessage());
        }
          try{
         throw new NullPointerException();
        }
        catch(Exception exception){
           System.err.println(exception.getMessage());
        }
          try{
         throw new IOException();
        }
        catch(Exception exception){
           System.err.println(exception.getMessage());
        }
        
        
    }
    
}