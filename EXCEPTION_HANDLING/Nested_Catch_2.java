public class Nested_Catch_2 {
     
     public static void main(String[] args) {
          try
          {
               System.out.println("outer try");
               throw new ArithmeticException();//this is passed to th catch block
          }
          catch(Exception e)
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
