class MyException extends Exception //in order tospecify the used defined exception we must use the super class as the Exception becuause of all the exceptions like runtime, io , class cast etc are the child classes to the Exception class if our user defined exception need the behaviour of the Exception classes then we use superclass as the Exception
{
     MyException()
     {
          super("HELLO YOU CAN'T CAN'T US");//this string description is used to pass the description about this exceptionn
          //when exceptionn occurs then this above description is promted on the console
     }
}


public class User_Defined_excpt_1 {
     
     public static void main(String[] args) {
          try
          {
               throw new MyException();
          }
          catch (Exception e)
          {
               e.printStackTrace();
               System.out.println(e);
               System.out.println(e.getMessage());
          }

     }
}
