import java.io.*;
public class Docs_file_copy
{

     ///we can also send the pdf files also
     public static void main(String[] args) throws Exception {
          FileInputStream fi  = new FileInputStream("C:/Users/Bhanusivateja/OneDrive/Desktop/temp.docx"); //extension is manditory
          //FileInputStream fi  = new FileInputStream("C:/Users/Bhanusivateja/Downloads/Inner_Classes.pdf");

          int size = fi.available();
          byte b[]  = new byte[size];


          fi.read(b);
          fi.close();

          FileOutputStream fo = new FileOutputStream("C:/Users/Bhanusivateja/OneDrive/Desktop/XSS_I.docx");
          fo.write(b);
          fo.close();
          


}

     }
