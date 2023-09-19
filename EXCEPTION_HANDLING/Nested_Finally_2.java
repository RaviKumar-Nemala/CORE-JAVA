public class Nested_Finally_2 {
     public static void main(String[] args) {
          try
          {
               
          }
          catch(Exception e)
          {
          
          }
          finally
          {
               try
               {
                    System.out.println("FINNALY - TRY");
                    throw new ArithmeticException();
               // System.out.println("AFTER THROWING ");//unreachable code but if you write in normal method of any class you didn't get this error
               }
               catch(Exception  e)
               {
                    System.out.println("FINNALY - CATCH");
               }
               finally
               {
                    System.out.println("FINALLY - FINALLY");
               }
          }
          System.out.println("NORMAL OUTSIDE ");
     }
}
