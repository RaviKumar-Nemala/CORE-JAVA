import java.io.FileReader;

public class Try_with_Resources_1 {
     
     public static void main(String[] args) {
          FileReader fr  = null;
          //this is the try- with resource approach
//first declare the resources before the try block
//if any exception is occurs then it will be caught on the catch block
//after that in the finally block close the resource

          try
          {     
               fr=  new FileReader("C:/Users/Bhanusivateja/hi.txt");         
               int temp = fr.read();
               String s = new String();
               while(temp != -1)
               {
                    s = s+(char)temp;
                    temp = fr.read();
               }
               System.out.println(s);
          }
          catch (Exception e)
          {
               e.printStackTrace();
          }
          finally
          {    //while closing the resources if any exception is occurs then it
               //must be caught by the catch block 
               try
               {
               fr.close();
               }
               catch(Exception e)
               {
                    e.printStackTrace();
               }
          }

     }
}
