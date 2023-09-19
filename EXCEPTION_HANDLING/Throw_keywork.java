import java.util.Scanner;

public class Throw_keywork {
     
     public static void main(String[] args) {
          int i ;
          Scanner sc = new Scanner(System.in);
          System.out.println("ENTER THE NUMBER BETWEEN 1 - 10");
          int sc_val = sc.nextInt();
          if(sc_val <=10 && sc_val >=1)
          {
               System.out.println("valid");
          }
          else
          {
               throw new RuntimeException("INVALID INPUT"); //
               //if invalid input is there then we explicitly raise the exception with the help of throw keyword
          }
     }
}
