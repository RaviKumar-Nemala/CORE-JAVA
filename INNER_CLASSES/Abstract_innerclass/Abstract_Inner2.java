abstract class Outer{

     class Inner
     {
          void inner_method_m1()
          {    
               System.out.println("m1");
          }
          void inner_method_m2()
          {
               System.out.println("m2 ");
          }
     }
}
class Child extends Outer
{

}
public class Abstract_Inner2 {
     public static void main(String[] args) {
          Outer.Inner  oi = new Child().new Inner();
          oi.inner_method_m1();
          oi.inner_method_m2();
     }
}
