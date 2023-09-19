import java.io.*;
import java.util.Scanner;
public class Count_specified_file {
     
     public static void main(String[] args) throws Exception {
          FileOutputStream fs = new FileOutputStream ("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/Hello");
          Scanner sc = new Scanner(System.in);
          String content =  sc.nextLine();
          byte b[] = content.getBytes();
          fs.write(b);
          fs.close();
          sc.close();

          FileInputStream fi = new FileInputStream("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/Hello");
          byte br[] = { };

          br = fi.readAllBytes();
          fi.close();
          content = new String(br);
          int count = 0;
          String [] seperater = content.split(" ");
          for (String temp : seperater)
          {
               if(temp.equals("ravi"))
               {
                    count++;
               }
          }
          System.out.println(count);

     }         
}
