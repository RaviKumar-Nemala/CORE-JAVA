
public class temp {

     
     void m1()
     {

          System.out.println("INSIDER OF THE  M1 METHOD ");
     }


     void m2() 
     {

          System.out.println("INSIDE OF THE M2 METHOD ");
     }


      class Inner extends temp
     {

               void i1()
               {
                    System.out.println("INSIDE OF THE I1 METHOD ");
               }

               void i2()
               {
                    System.out.println("INSIDE OF THE I2 METHOD");
               }
     }

public static void main(String[] args) {
     

     temp.Inner  ti = new temp().new Inner();

     temp t = new temp();

     t.m1();

     ti.i1();

     ti.i2();

     ti.m1();

     ti.m2();
     

     //ti.1();
     //it.i2();

}

}


