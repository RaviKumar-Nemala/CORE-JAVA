package INTRODUCTION;
class Instance_Blocks
{
     Instance_Blocks()
     {
          System.out.println("CONSTRUCTOR");
     }

     int i = m1();

     {
          System.out.println("BLOCK - 1 ");
     }

     {
          System.out.println("BLOCK - 2");
     }

     int j = m2();
     int m1()
     {
          System.out.println("m1 method");
          return 1;
     }

     int m2()
     {
          System.out.println("M2 method");
          return 2;
     }
     void sample()
     {

     }
}



public class Instance_Blocks_and_Priority {
 
     public static void main(String args[])
     {
          Instance_Blocks obj = new Instance_Blocks();
          obj.sample();
     }
}
