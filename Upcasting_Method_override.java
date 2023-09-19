class Parent
{    

     void m1()
     {
          System.out.println("PARENT CLASS METHOD");
     }
     void p1()
     {
          System.out.println("PARENT CLASS METHOD");

     }
}

class Child extends Parent
{
     
     void m1()
     {
          System.out.println("CHILD CLASS  METHOD");
     }
     void c1()
     {
          System.out.println("CHILD CLASS  METHOD");
 
     }
}

public class Upcasting_Method_override {
     
     public static void main(String[] args) {
          
          Parent p = new Child();
          p.m1(); //expected is the parent class m1 method but the output is the child class mehtod
          //because of the when the child class object is created and assigned to the parent reference value then mehtod overriding is performed this is why new implementation of the method is called
          //so upcasting is  the  example for the method overiding 
          p.p1(); //with the help of the super class keyword we can only access the super class methods (not overidden methods) we cannot access the sub class methods
         // p.c1(); // c1 is the sub class so it not possible to invoke that method with the super class ref variabled
     }
}
