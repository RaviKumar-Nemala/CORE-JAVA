class Parent
{
     int i  = 1 , j = 2;
     Parent()
     {
      //default constructor is manditory in the super class if we did not explictily specify the constructor on to the child class with the help of the super keyword
     }
     Parent(int i )
     {
          System.out.println("PARENT CLASS");
     }
      void m1()
     {
          System.out.println("SUPER CLASS METHOD");
     }
}

class Child extends Parent
{
     int i  = 3 , j = 4;
     Child()
     {
          super(1); //like this constructor super class constructor must be the first statement in the child class constructor 
          //super() only declared in the child constructor only
     } 

     void m1()
     {
          //super(1) this is compilation error becuase of the super statement constructor must be provided in child class constructor only
          System.out.println("LOCAL CLASS METHOD");
     }
     void access(int i , int  j)
     {
          System.out.println("LOCAL VARAIBLES : " +i  +"  "+j);
          System.out.println("CLASS INSTANCE VARIABLES : " +this.i  +" " +this.j);
          System.out.println("SUPER CLASS VARIABLES : " +super.i  +" " +super.j);

          m1();//current class method
          this.m1();//current class method
          super.m1();//this will refer to the super class method 
     }
}




public class Super_Keyword_1 {
     public static void main(String args[])
     {
          Child obj = new Child();
          obj.access(-1 , 0);
          
     }
}
