
class Outer
{
     interface I1 //it is possible to declare the interface inside of the 
                    // outer class but implementation should be in same outer class
     {
          void m1();
          void m2();

     }
     class Child  implements  I1
     {
          public void m1()
          {
               System.out.println("m1 method");
          }
          public void m2()
          {
               System.out.println("M2 METHOD");
          }

          void child_method()
          {
               System.out.println("CHILD CLASS METHOD");
           }
     }

}




public class  Part1
{
     public static void main(String[] args) {
          Outer. I1 oi = new Outer().new Child();
          oi.m1();
          oi.m2();
          //oi.child_method() ; // error only overriden methods are going to be accessed with the interface ref_Var cannot access the child class own members
          
          Outer.Child oc = new Outer().new Child();
          oc.m1();
          oc.m2();
          oc.child_method();
     }
}