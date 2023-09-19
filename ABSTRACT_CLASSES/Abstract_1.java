abstract class Parent{

     void a1()
     {
          System.out.println("ABSTRACT CLASS CONCRETE METHOD");
     }
     abstract void m1();
     abstract void m2();
}

class Child extends Parent
{
     void m1()
     {
          System.out.println("OVERRIDEN METHOD");
     }

     void m2()
     {
          System.out.println("OVERRIDEN METHOD");
     }

     void child_1()
     {
          System.out.println("CHILD CLASS METHOD");
     }

     void child_2()
     {
          System.out.println("CHILD CLASS METHOD");
     }
}
public class Abstract_1 {
     public static void main(String[] args) {
          
         // Parent p  = new Parent(); // we cannot create the object for the abstract classes but the ref_var is possible
          Parent  p = new Child();
          p.a1();
          p.m1();
          p.m2();
          //p.child_1(); // THIS WILL GIVES ERROR WITH THE HELP OF THE PARENT REF_VAR WE CAN ONLY ACCESS THE ABSTRACT CLASS METHODS NOT THE CHILD CLASS METHODS
          Child cld = new Child();
          cld.a1();
          cld.m1();
          cld.m2();
          cld.child_1();
          cld.child_2();
          
     }
}
