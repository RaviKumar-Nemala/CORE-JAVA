class Outer
{
     static class Inner
     {

          static  void m1()
          {
               System.out.println("m1 method");
          }
     }
}

class Outer_1
{
     int i = 1;
     void o1()
     {
          System.out.println("o1");
     }
     static class Inner_1
     {
          static int k =11;
          static void access()
          {
          // System.out.println(i);//error cannot access non static variables from the static class
               //o1() //error o1 is non static method
               System.out.println(k);//this is valid because of  compiler will check k var is presented in the local scope so k is in the local scope so it does not raise error
          }
     }
     class Check extends Inner_1{
          void gain() //possible 
          {
               access();
               System.out.println(k);
          }
     }
}



class Outer_2  {


     static int i =  10 ; 

     static  class Inner_2 
     {

           static  void i2 ( ) 
          { 

          System.out.println( " INSIDE OF THE I2 METHOD ");

          System.out.println(i);


          }

     }
}    


public class static_inr_1 {
     public static void main(String[] args) {
          // STATIC CLASS IS ONLY ALLOWED AS INNER CLASS WE CAN'T DECLARE THE STATIC CLASS AS THE OUTER CLASS
          //THIS IS THE WAY OF CREATING THE OBJECT FOR THE STATIC 
          Outer.Inner oi = new Outer.Inner();
          oi.m1();

          Outer.Inner.m1(); //second way of calling the stitic method inside of the static class


          //second way for declaring the staic class ref_var
          Outer_1.Inner_1.access(); //accssing the method with the help of the class name
          //since inner is the class name which is at the outer class so outer.inner is required
          //int temp = Outer.Inner.k;

          
          Outer_2.Inner_2 oi2 = new Outer_2. Inner_2();

          oi2.i2();

          
     }
}
