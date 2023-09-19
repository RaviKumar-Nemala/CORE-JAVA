import java.util.*;

class Parent
{
     void m1()
     {
          System.out.println("M1 METHOD");
     }
}

abstract class Child extends Parent 
{
     abstract void m2();
}

class Gs extends Child
{
     void m2()
     {
          System.out.println("GRAND CHILD");
          Arrays.asList(1,3,45);
     }
}
public class Abstarct_4 {
     public static void main(String[] args) {
               Parent p = new Gs();
               p.m1(); 
               Child ch  = new Gs();
               ch.m1();
               ch.m2();
               
     }
}
