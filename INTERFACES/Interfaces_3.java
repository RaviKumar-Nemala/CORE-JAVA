interface I1
{
     void m1();
     void m2();
     void m3();
}

abstract class Abs implements I1
{
     public void m1()
     {
          System.out.println("M1 METHOD ");;
          //PROVIDED FOR THE IMPLEMENTATION FOR THE M1 METHOD 
          //REMAING IMPLEMENTATION WILL BE AT THE SUB CLASS
     }
}
class Child extends  Abs{

     public void m2(){
          System.out.println("M2 METHOD");
     }
     public void m3()
     {
     System.out.println("M3 method");
     }
     void ch1()
     {

     }
}


public class Interfaces_3 {
     
     public static void main(String[] args) {
          I1 i =  new Child();//cannot create the object for the abstact class abs
          i.m1();
          i.m2();
          i.m3();
        //  i.ch1();//cannot access this is only on the child class only 

     }
}
