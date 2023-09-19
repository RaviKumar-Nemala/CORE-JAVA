package INTRODUCTION;
class Temp{

     protected int i  =10;

}
class Child extends Temp{

     int i = 11;
     void access()
     {
          System.out.println(this.i); // it will print the value 11 because the i val is already available at the Child class it is not then it will check for the i value on to the super class.
     }

     void m1()//we can also use the this keyword for the methods 
     {
          this.m2();
     }
     void m2()
     {
          System.out.println("M2");
     }
}



public class This_Keyword_Illustration {
     
     public static void main(String args[])
     {
          Child obj = new Child();
          obj.access();
          obj.m1();
     }

}
