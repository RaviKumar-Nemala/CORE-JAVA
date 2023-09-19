public class Nested_Try_2 {
     public static void main(String[] args) {
     //HERE WE ARE RAISING THE EXCEPTION ON THE INNER TRY BLOCK 
     try
     {

          System.out.println("OUTER TRY");
          try
          {
               System.out.println(" INNER TRY");
               System.out.println(1/0);

          }
          //here exception is only raised on the inner try block so only the inner catch block is executed
          //but outer catch block is not exectued because exception is not raised on the outer try
          //both inner and outer finally blocks are executed
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


     /* second version

          
}

}
