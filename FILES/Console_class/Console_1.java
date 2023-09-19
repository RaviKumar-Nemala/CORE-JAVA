import java.io.*;
import java.util.*;
public class Console_1 {
     public static void main(String[] args)throws Exception {
         Console console = System.console(); 
         System.out.println("ENTER YOUR NAME :");
         String s = console.readLine();
         System.out.println("ENTER YOUR PASSWORD : ");
          char passwd [] =console.readPassword();
          System.out.println(s+"  ");
          String str =  new String(passwd);
          System.out.println(str);
     }
}
