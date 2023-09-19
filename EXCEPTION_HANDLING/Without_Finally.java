class A
{
     int 
     access()
     {
          try
          {
               System.out.println("BEFORE THE EXCEPTION");
               System.out.println(1/0);

          }
          catch(ArithmeticException ob)
          {
               System.out.println("catch block ");
               return 10;
          }//once we specify the catch block obnormal termination of the program is not going to be happen
          System.out.println("NORMAL STATEMENT AFTER THE CATCH BLOCK");
          return 11;
     }
}
/*    CATCH BLOCK WITH THE RETURN STATEMENT
class A
{
     int 
     access()
     {
          try
          {
               System.out.println("BEFORE THE EXCEPTION");
               System.out.println(1/0);

          }
          catch(ArithmeticException ob)
          {
               System.out.println("catch block ");
               return 10;
          }//once we specify the catch block obnormal termination of the program is not going to be happen
          System.out.println("NORMAL STATEMENT AFTER THE CATCH BLOCK");
          return 11;
     }

*/
public class Without_Finally {
     public static void main(String[] args) {
          A obj  = new A();
         System.out.println( obj.access());
     }
}
