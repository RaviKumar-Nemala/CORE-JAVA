
interface Outer
{
     void o1();
     class Inner
     {
          void i1()
          {

          }
     }
     class Child extends Inner
     {
          
     }
}
class Second implements Outer
{
     public void o1()
     {
          System.out.println("OUTER CLASS OVERRIDDEN METHOD");
     }
     void s1()
     {

     }
}
public class _Temp_Outer_Interface_Inner_Class {
     public static void main(String[] args) {
          Outer.Child oc = new Second(). new Child();
          oc.i1();
          oc.o1();
          //oc.s1(); //canno access you already know this point 

     }
}
