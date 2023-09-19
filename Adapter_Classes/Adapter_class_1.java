import java.sql.PseudoColumnUsage;

interface I1
{
     void m1();
     void m2();
     void m3();
     void m4();
     void m5();
     void m6();
     void m7();
}
abstract class Medium implements  I1
{
     public void m1() { }
     public void m2(){ }
     public void m3() { }
     public void m4() { }
     public void m5() { }
     public void m6() { }
     public void m7() { }
}
//HERE MEDIUM IS AND AN MEDIATOR WHICH HAS TO IMPLEMENT THE ALL THE INTERFACES NOW WITHE THE HELP OF 
// SUB CLASS WE CAN OVERRIDE THE MEDIUM METHDOS AS PER OUR REQUIREMENT
//THERE IS NO NEED TO OVER RIDE ALL THE METHODS 

class C1 extends Medium{
     public void m1(){
          System.out.println("M1 METHOD");
     }
}

class C2 extends Medium{
     public void m2(){
          System.out.println("m2 Method");
     }
}


class C3 extends Medium{
     public void m3(){
     System.out.println("m3 method");
     }
}

public class Adapter_class_1 {
     public static void main(String[] args) {
          
     }
}
