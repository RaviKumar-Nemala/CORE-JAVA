interface Outer
{
     interface Inner//it is a class becaz it is inside of the interface
     {
          void m1();
          
          void m2();
         
     }

     class Child implements Inner
     {
          public void m1()
          {
               System.out.println("OVER RIDDEN M1 METHOD ");
          }
          public void m2()
          {
               System.out.println("OVER RIDDEN M2 METHOD");
          }

          public void  m3()
          {
               System.out.println("M3 METHOD ");
          }
     }
}




public class Intefeface_outer_and_inner {
     public static void main(String[] args) {


          Outer.Inner oi =  new Child();

          oi.m1();
          oi.m2();

          
     }
}
