import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Multiple_Catch_2 {
     
/**
 * if any catch block has the pure checked exception 
 * then corresponding try block throw that exception
 * if try block does not throws that exception then it becomes the error
 * /
 */

 public static void main(String[] args) {
    
    /* try     INVALID
      {
          throw new ArithmeticException("jfa");
      }
      catch (ArithmeticException ar)
      {
          ar.printStackTrace();
      }
      catch(FileNotFoundException f) // this is the pure checked exception then it must be thrown by the try but here try block not throwing this exception so it is error
      {

      }   

      */


      //VALID
      try
      {
          throw  new FileNotFoundException();//can also use Ioexceptioon filenotfound is sub class of the io exception
      }
      catch (RuntimeException r)
      {

      }
      catch(IOException i)
      {
          i.printStackTrace();
      }

      
 }

}
