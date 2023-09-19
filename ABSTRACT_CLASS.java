package INTRODUCTION;
abstract class Abstract_Check
{
     void m1()
     {
          System.out.print("m1  method in the absract class");
     }
     abstract void m2();
     
}

class Sub_Class extends Abstract_Check

{
     void m2()
     {
          System.out.println("M2 METHOD HAS CALLED");
     }
     void sub_method()
     {
          System.out.println("inside the sub class");
     }
     void  Access_abstract_Method()
     {
          m1();
     }
}

public class ABSTRACT_CLASS
{
     public static void main(String Args[])
     {
          Abstract_Check obj = new Sub_Class();
          obj.m1();
          obj.m2();
          //obj.sub_Method(); //error because of the reference variable is abstract class type not the sub class type this is obly access the methds of the abstract class not the sub class methods
          
          Sub_Class s1 =  new Sub_Class();
          s1.Access_abstract_Method();
          s1.m1();
          s1.sub_method();
     }
}


