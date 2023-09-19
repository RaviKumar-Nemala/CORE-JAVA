
abstract class Outer
{

     interface I1
     {
          void m1();
          void m2();
     }
     class Child implements I1
     {
         public  void m1()
          {
               System.out.println("M1 METHOD ");
          }
          public void m2()
          {
               System.out.println("M2 METHOD");
          }
     }
     class Check extends Outer
     {

     }
}

class Second extends Outer
{

}


public class Part_1 {
     public    static void main(String[] args) {
         // Outer.I1 oi = new Check(). new Child(); //not possible like this
          Outer.I1 oi = new Second(). new Child();
          oi.m1();
          oi.m2();
     }     
}
