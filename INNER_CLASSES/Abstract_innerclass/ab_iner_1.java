package Abstract_innerclass;

class Outer{
     abstract class Inner
     {
          public void m1()
          {

          }
          abstract void m2();
          abstract protected void m3();
     }

     class Child extends Inner
     {
          void m2()
          {
               System.out.println("M2 METHOD");
          }   
          //public //protected is ok // 
          public void m3()
          {
               System.out.println("M3 METHOD");
          }
     }
}
public class ab_iner_1 {

          public static void main(String[] args) {
               Outer.Child oc = new Outer().new Child();
               oc.m1();
               oc.m2();
               oc.m3();
          }
}
