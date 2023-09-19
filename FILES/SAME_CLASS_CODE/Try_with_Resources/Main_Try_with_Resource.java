import java.io.*;

public class Main_Try_with_Resource {
     public static void main(String[] args) {
          //from the java 7th version it provided the try -with resource 
//approch it ensures the close of the resources automatically
          String s = new String();
          try( FileReader fr=  new FileReader("C:/Users/Bhanusivateja/hi.txt"))
          {
               int temp = fr.read();

               s = new String();
               
               while(temp != -1)
               {
                    s = s + (char)temp;
                    temp  = fr.read();
               }
          }//after exit from the try block the resorces are going to be closed automatically this is the feature which will automate the closing of the resources
          catch(Exception e )
          {
               e.printStackTrace();
          }
          System.out.println(s);
     }
}
