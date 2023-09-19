public class Nested_Try {
     

     public static void main(String[] args) {
          
          try
          {

               System.out.println("OUTER TRY");
               try
               {
                    System.out.println(" INNER TRY");

               }
               catch(Exception e )
               {
                    System.out.println("INNER CATCH");
               }
               finally
               {
                    System.out.println("INNER FINALLY");
               }
          }
          catch (Exception e)
          {
               System.out.println("OUTER CATCH");
          }
          finally
          {
               System.out.println("OUTER FINALLY");
          }
     }
}
