import java.io.*;
public class Transfer_Image {

     public static void main(String[] args)throws Exception {

          //images are in the form of the bytes so only with the help of the file byte oriented streams we can access and transfer the data we cannot read the data with the help of filereader and the filewriter for image copy
         FileInputStream fi  = new FileInputStream("C:/Users/Bhanusivateja/OneDrive/Pictures/Screenshots/Screenshot_1.png"); //extension is manditory
          //FileInputStream fi  = new FileInputStream("C:/Users/Bhanusivateja/Downloads/Inner_Classes.pdf");

          int size = fi.available();
          byte b[]  = new byte[size];

          fi.read(b);
          fi.close();

          FileOutputStream fo = new FileOutputStream("C:/Users/Bhanusivateja/OneDrive/Desktop/XSS_IS.png");
          fo.write(b);
          fo.close();


     }
}
