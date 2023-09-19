
interface I1
{
     void m1();
}

 interface I2 
{
     void m2();
}

interface I3 extends  I1 , I2
{
     void m3();
}

class Child implements I3{
     public void m1()
     {
          System.out.println("M1");
     }
     public void m2()
     {
          System.out.println("M2");
     }
     public void m3()
     {
          System.out.println("M3");
     }
}

public class Interfaces_4
{
     public static void main(String[] args) {
          I3 obj = new Child(); //i3 is the sub class for the i1 and i2 so all methods are accessabe
          obj.m1();
          obj.m2();
          obj.m3();
          I1 i1 = new Child(); // only m1 method is possible 
          i1.m1();

          I2 i2 = new Child();//only m2 method
          i2.m2();

          Child ch = new Child();
          ch.m1();
          ch.m2();
          ch.m3();
     }
}