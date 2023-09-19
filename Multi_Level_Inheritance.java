//STATIC CONTEXT AND INSTANCE CONTEXT ILLUSTRATION
//IN THE INHERITANCE EVERY TIME THE SUPER CLASS BYTE (TOP MOST ) WILL LOAD IN TO THE MEMORY 
//IF THAT SUPER CLASS HAS ANY STATIC CONTEXT THEN THAT WILL RECOGNIZED AND EXECUTED 
//AFTER THAT ONLY THE OBJECT IS CRETED
//DURING OBJECT CREATION IF ANY INSTANCE CONTEXT IS THERE THEN INSTANCE CONTEXT WILL BE EXECTUED
//in this example after executing the super class static block it will go to the sub_class_1 static block after exectuing that then it will again come to the instance context of the super class then it will go to the instance context of the subclass_1
class SuperClass
{
     int s1 , s2;
     static 
     {
          System.out.println("SUPER STATIC");     
     }

     {
          System.out.println("SUPER INSTATNCE BLOCK");
     }
     void setVal( int i , int j )
     {
          this.s1 = i ;
          this.s2 = j;
     }
     void printVal()
     {
          System.out.println( s1   +" + " +s2);
     }
     void m1()
     {
          System.out.println("SUPER CLASS ");

     }

     SuperClass()
     {
          System.out.println("HELLO FROM THE SUPER CLASS");
          setVal(5,6);
     }
}

class SubClass_1  extends SuperClass{

     int c1 , c2;
     
     static 
     {
          System.out.println("SUBCLASS_1 STATIC");     
     }

     {
          System.out.println("SUBCLASS_1 INSTATNCE BLOCK");
     }
     void m1()
     {
          System.out.println("SUB CLASS 1 ");
     }

     SubClass_1()
     {
          this(1,2);
     }
     SubClass_1(int i , int j )
     {
          setC1(i);
          setC2(j);
     }
     

     public int getC1() {
          return c1;
     }

     public void setC1(int c1) {
          this.c1 = c1;
     }

     public int getC2() {
          return c2;
     }

     public void setC2(int ch2) {
          this.c2 = ch2;
     }
}
class SubClass_2 extends SubClass_1
{

     SubClass_2()
     {
          
     }
     void access(){
          
          m1();
     }
}

public class Multi_Level_Inheritance {
     public static void main(String args[])
     {
          SubClass_2 obj = new SubClass_2();
          obj.access();
          System.out.println(obj.getC1() + "  "+ obj.getC2());
     }
}
