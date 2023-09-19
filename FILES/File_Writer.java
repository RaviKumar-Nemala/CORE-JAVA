import java.io.*;

import javax.annotation.processing.FilerException;

public class File_Writer {
     public static void main(String[] args) throws Exception{
          FileWriter fw   = new FileWriter("C:/Users/Bhanusivateja/hi.txt" , false);//if it's true then it is append mode
          //if we want to append the content to this particular file then we must use the "TRUE " AS THE SECOND PAREAMTER
          String s = new String("HE DOES KNOW THAT GOD IS DEAD");
          
          fw.write(s);    

          fw.close();

          FileReader fr = new FileReader("C:/Users/Bhanusivateja/hi.txt");
          int temp = fr.read();
           s = new String();
          while(temp!= -1)
          {
               s = s+(char)temp;
               temp = fr.read();
          }
          fr.close();
          System.out.println(s);
     }
}
