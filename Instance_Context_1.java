package INTRODUCTION;
class Instance_Method_Check
{
     int i  = m1();//these exprs are evaluated before calling the constructors
     int j = m2();


     int  m1()
     {
          System.out.println("M1 METHOD HAS CALLED");
          return 1;
     }
     int m2()
     {
          System.out.println("M2 METHOD HAS CALLED");
          return 2;
     }
     Instance_Method_Check()
     {
          System.out.println("CONSTRUCTOR");
     }
     void sample(){

     }
}


public class Instance_Context_1 {
     
     public static void main(String args[])
     {

          Check obj = new Check();
          obj.set_Val(110);
          obj.print_Val();

          Instance_Method_Check ins_obj = new Instance_Method_Check();
          ins_obj.sample();
     }
}
