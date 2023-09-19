
//IN THIS PROGRAM WE ARE CREATING OUR OWN EXCEPTIN CLASS along with user define exception class
class Exception extends Throwable
{
     String exceptionDetails;

    public Exception()
     {

     }
     public Exception(String temp)
     {
          this.exceptionDetails = temp;
     }
     public void printStackTrace()
     {
          System.out.print("EXCEPTION   :");
          System.out.println(exceptionDetails);
          //here we need to specify the line where the exception has occured 

     }
    public String getMessage()
     {
          return this.exceptionDetails;
     }
     public String toString()
     {
          return exceptionDetails; //need to specify the exception name 
     }
}


class OutOfBoundException extends Exception
{
     OutOfBoundException(String msg)
     {
          super("INDEX OUT OF BOUND EXCEPTION");
     }
}

class Check
{
     void play()
     {
          int arr[] = new int [10];
          try
          {
               int invalid_idx = 11;
              // int number = arr[invalid_idx];
               throw new OutOfBoundException("INDEX OUT OF BOUND");
          }
          catch (OutOfBoundException i)
          {    
               i.printStackTrace();//for full details
               System.out.println(i.getMessage());
          
          }
     }
}

public class Part_2 {

     static void check()
     {
          try
          {
               throw new IndexOutOfBoundsException();
          }
          catch(IndexOutOfBoundsException e)
          {

          }
     }
     public static void main(String[] args) {
          Check obj  = new Check();
          obj.play();
          check();
          
     }
}
