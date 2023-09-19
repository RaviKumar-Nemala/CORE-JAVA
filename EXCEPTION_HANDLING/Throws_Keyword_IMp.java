import java.io.IOException;
import java.sql.SQLClientInfoException;

class Test
{
      void first_method() throws IOException //exception is transferred to the caller
     {
          second_method();
     }

     void second_method() throws IOException  //if we specify then exception will be transffered to the caller 
     /*here we ony sepcify the same exception name which has been throws or the super class exception of the thrown exception*/
     {
          throw new IOException();//this is catchable exception during the compilation this exceptions are identified and recognized
     }
}


public class Throws_Keyword_IMp {
     
     public static void main(String[] args) throws Exception{//here we specify the io exception manually and it can be catched by the throws keyword then it returns to thecaller that is first method() then that place throws keyword is used then it transferred to the caller exception which is in the main method
          // not that exception is transffered to the super class of the ioexception is Exception at Exception it can be handled then it will display all the locations where the exceptions has raised
          Test t1 = new Test();
          t1.first_method();
     }    
}
