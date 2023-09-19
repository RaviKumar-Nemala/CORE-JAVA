public class Nested_Catch_1 {
     
     public static void main(String[] args) {
          try
          {
               System.out.println("outer try");
               throw new ArithmeticException();
          }
          catch(Exception e)
          {
               System.out.println("outer catch");
               try
               {
                    System.out.println("CATCH -TRY");
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
