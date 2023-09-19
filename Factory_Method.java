
class F
{
     private F()
     {
          System.out.println("CONSTRUCTOR");
     }
     static F m1() //any method returns the object then it is called as the factory method 
     {
          F obj = new F();
          return obj;
     }
     void m2()
     {
          System.out.println("NORMAL M2 METHOD");
     }
}



public class Factory_Method {
     
     public static void main(String[] args) {
          F t = F.m1();//here we have created the object with the help of the static method and the constructor is in the private 
          //IF THE STATIC METHOD IS NOT AVAILABLE THEN IT IS NOT POSSIBLE TO CREATE THE OBJECT FOR THAT CLASS
     }
}
