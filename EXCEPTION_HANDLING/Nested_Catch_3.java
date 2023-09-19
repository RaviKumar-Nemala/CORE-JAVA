public class Nested_Catch_3 {
     public static void main(String[] args) {
          try
          {
               System.out.println("outer try");
               throw new ArithmeticException();//this is passed to th catch block
          }//here we are raising the arithmetic excetpion but we are using
          //the Indexout of bound exception to store that so here catch block 
          //is not executed but inner finally block exectued after that the 
          //program is terminated becuase of the exception is handled by the inner catchblock

          catch(IndexOutOfBoundsException e)
          {
               System.out.println("outer catch");
               try
               {
                    System.out.println("CATCH -TRY");
                    throw new ArithmeticException();//this will passed to the inner catch block
               }
               catch(Exception e1)
               {
                    System.out.println("CATCH -CATCH");
               }
               finally
               {
                    System.out.println("CATCH-FINALLY");
               }
          }
          finally
          {
               System.out.println("OUTER FINALLY");
          }
     }

}
