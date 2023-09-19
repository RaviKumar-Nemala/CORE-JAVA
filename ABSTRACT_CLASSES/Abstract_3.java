import java.time.LocalDateTime;

import javax.swing.plaf.PanelUI;

//CONSTRUCTORS ARE POSSIBLE IN THE ABSTRACT CLASS


abstract class Parent
{
     Parent()
     {
          System.out.println("PARENT ABSTRACT CLASS CONSTRUCTOR");
     }
}
class Child extends Parent
{
     Child()
     {
          System.out.println("CHILD CLASS CONSTRUCTOR");
          LocalDateTime lc = LocalDateTime.now();

          System.out.println(lc.set);
          
     }
}

public class Abstract_3 {
     public static void main(String[] args) {
          Parent p = new Child();// cannot create the objects for the abstract class


     }
}
