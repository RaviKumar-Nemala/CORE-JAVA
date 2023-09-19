public class Nested_Finally {
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
     }
}
