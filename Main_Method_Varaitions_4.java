class A
{
     static void m1()
     {
          System.out.println("PARENT");
     }
}

class B extends A
{

     public static void main(String args[])
     {
          B obj = new B();
         obj.m1();
         A.m1();
     }
     static void m1() 
     {
          System.out.println("CHILD");
     }
}

