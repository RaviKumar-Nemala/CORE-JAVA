import java.util.*;
public class Scanner_2 {
     public static void main(String[] args) {
          String s  = "hello you are not  mine";
          Scanner sc  = new Scanner(s);
          sc.useDelimiter(" ");

          while(sc.hasNext()) //Returns true if this scanner has another token in its input.
          {
               System.out.println(sc.next());//returns the next complete token from this scanner.
          }
          sc.close();
     
     }
}

