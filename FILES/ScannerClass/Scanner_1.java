import java.util.*;
import java.io.*;
public class Scanner_1 {
     public static void main(String[] args) throws Exception{
     //     FileInputStream fi = new FileInputStream("C:/Users/Bhanusivateja/hi.txt");
     
     // FileOutputStream  fw  = new FileOutputStream("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/ScannerClass/temp.txt");
     
     // byte b[] = new byte[1];

     // b[0]= 11;

     // fw.write(b);
     
     // fw.close();
     
     
     FileInputStream fi = new FileInputStream("D:/CORE_JAVA_UDEMY/INTRODUCTION/FILES/ScannerClass/temp.txt");
     
     Scanner sc ;

          sc = new Scanner(fi);
          
          sc.useDelimiter(" ");

          byte str = sc.nextByte();

          System.out.println( str) ;

          // byte it = (byte)sc.nextByte();

          // System.out.println ( str  + " " + it );
          
          sc.close();
          fi.close();
          //sc.useDelimiter(" ");
          //String s  = sc.nextLine();
          //System.out.println(s);
          //System.out.println(sc.toString());
          // System.out.println(sc.nextLine());


          /**
           * int  = sc.nextInt();
           * float = sc.nextFloat();
           * double = sc.nextDouble();
           * char = sc.nextChar();
           * 
           */
     }
}
