import java.io.*;
public class file_Output_Stream {
     public static void main(String[] args) throws Exception {
          FileOutputStream fs = new FileOutputStream("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/my_file.txt",  false); //false represents that we are overirding the exsited data in the file
          /**NOTE: FILE IS NOT AT THE SPECIFIED LOCATION THEN 
           * IT WILL CREATE THE FILE WITH THE SPECIFIED NAME THEN IT 
           * ADDS THE DATA TO THE FILE
           * IT DOES NOT RAISE THE FILENOTFOUND EXCEPTION
           */
          
           String s = new String("HELLO YOU CAN'T CATCH US" );
           byte dataBytes[] = s.getBytes();
           fs.write(dataBytes);
           fs.close();


           FileInputStream fi = new  FileInputStream("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/my_file.txt");
           String str  = "";
           byte b [] ={};

          b = fi.readAllBytes();
          
          fi.close();
          for ( byte t :  b)
          {
               str = str + (char)t;
          }
          
          System.out.println(str);
 
     }
}
