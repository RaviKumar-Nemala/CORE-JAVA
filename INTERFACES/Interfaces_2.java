interface I1
{
     void m1();
     int i = 33; // public static final
}

interface I2
{
     void m1();//DUPLCATE  METHOD BUT FOR I1 AND THE I2 IMPLEMENTATION IS GOING TO BE THE SAME
     void m2();
}

interface I3
{
     void m3();
}

class Child implements I1 , I2 , I3
{
     public void m1()
     {
          System.out.println("M1 METHOD ");
     }

     public void m2()
     {
          System.out.println("M2 METHOD");
     }
     public void  m3()
     {
          System.out.println("M3 METHOD");
     }
     
}

public class Interfaces_2
{

public static void main(String[] args) 
     {
          I1 a = new Child();
          //with the help of the I1 ref variable we can only access the m1 method
          a.m1();
          I2 i2 = new Child();
          i2.m1();
          i2.m2();
          I3 i3 = new Child();
          i3.m3();
          
          Child ch = new Child();
          ch.m1();
          ch.m2();
          ch.m3();
          // various ways of accssing the reference variable of the interfaces 
          int   i = I1.i;
           i =  a.i;
           i = Child.i ; //static variables can be accessed with the help of the inherited class name
           i  = ch.i;
     }
}