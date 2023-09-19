class Parent 
{
     void m1( )
     {
          System.out.println("SUPER CLASS ");
     }
}

class Child  extends Parent
{
      
     void m1()
     {
          System.out.println("SUB CLASS ");
     }
}


public class Method_Overriding_2 {
     public static void main(String[] args) {
          Parent a  = new Parent();
          a.m1(); // THIS IS NOT EXAMPLE FOR THE METHOD OVERRIDING
          Child  c = new Child();
          c.m1(); // THIS IS NOT EXAMPLE FOR THE METHOD OVERRIDING

          //NOTE : method overriding is to create the referenc variable to the Parent class but with that refernce variable we must access the sub class over ridden method 


          Parent parent = new Child();
          parent.m1();//THIS IS THE EXAMPLE FOR THE METHOD OVER RIDING  WITH THE HELP OF THE PARENT CLASS REF VARAIABLEWE ACCESSING THE PARENET CLASS METHOD BUT THE SUB CLASS METHOD IS EXECUTED 

     }
}
