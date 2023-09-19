class Parent
{
     void p1()
     {
          System.out.println("PARENT CLASS");
     }
     void m1()
     {
          System.out.println("PARENT");
     }
}

class Child extends Parent
{
     void c1()
     {
          System.out.println("CHILD CLASS");
     }
     void m1()
     {
          System.out.println("CHILD");
     }

}


public class Down_Casting {
 
     public static void main(String[] args) {
          /*Parent p = new Child();
          Child c = p; */ //exception :  TYPE MIS MATCH ERROR CANNOT ASSIGN THE PARENT CLASS REF VALUE TO THE SUB CLASS REF VALUE
          
          /*
          Parent p =  new Parent();
          Child c=  p;//COMPILATION ERROR  CANNOT ASSING THE SUPER CLASS REF VALUE TO THE SUB CLASS VARIABLES
          */

          
          Parent P =  new Child();

          Child  c = (Child)P;
          c.p1();
          c.c1();
          c.m1();
     }
}
