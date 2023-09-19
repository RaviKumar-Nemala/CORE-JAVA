abstract class A
{
     void m1()
     {
          System.out.println("M1 METHOD");
     }

     abstract void m2();
     abstract void m3();
}

class Outer
{
     //THE BELOW IS THE SYNTAX OF THE ANONYMOUS INNER CLASSES 
     //ANONYMOUS INNER CLASS MUST PROVIDE THE IMPLEMENTATION FOR ALL OF THE ABSTRACT METHODS
     //WHICH ARE DECLARED IN THE SUPER CLASS

     A a = new A(){
          int i  = 10;
          void m2()
          {
               System.out.println("OVER RIDDEN M2 METHOD ");
          }

          void m3()
          {
               System.out.println("OVER RIDDEN M3 METHOD");
          }
          /*
          void m4() ERROR BECUASE THIS ANONYMOUS ONLY USED FOR  IMPLEMENT THE SUPER CLASS MEMBERS
          //IT DOES NOT ALLOW FOR DECLARING THE LOCAL MEMBERS OR THE METHODS
          {
               System.out.println("HELLO ");
          }*/
     };
}


public class Anoums_Iner_cls_1 {
 public static void main(String[] args) {
      Outer outer = new Outer();
      outer.a.m1();
      outer.a.m2();
     outer.a.m3();


     // System.out.println(outer.a.i);
     // outer.a.m3();
      //outer.a.m4();


      //this is anothe way of declaring the anonymous inner classes
      A t = new A(){
          int i  = 10;
          void m2()
          {
               System.out.println("OVER RIDDEN M2 METHOD ");
          }

          void m3()
          {
               System.out.println("OVER RIDDEN M3 METHOD");
          }
          /*
          void m4() ERROR BECUASE THIS ANONYMOUS ONLY USED FOR  IMPLEMENT THE SUPER CLASS MEMBERS
          //IT DOES NOT ALLOW FOR DECLARING THE LOCAL MEMBERS OR THE METHODS
          {
               System.out.println("HELLO ");
          }*/
     };

     t.m1();//declared ref_var and the method calling ref_var both has to be same
     t.m2();
     t.m3();
 }    
}
