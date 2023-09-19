interface  I1
{
     
     void dimensions(int length , int width );
     void printSizes(); //by default it is public abstract 
    // I1()//
    // {
               //constructor is not possible in side of the intefaces
     //}//
     int a = 99;//by default it is public static final variable s
}
class A  implements I1
{
    public  void dimensions(int lenght ,  int width)
     {

     }
     public void printSizes()
     {
     System.out.println(A.a);//possible    
     }
}    

public class Interfaces_1
{
     public static void main(String args[])
     {
          System.out.println(A.a);//possible
          System.out.println(I1.a);//possible
     
     }
}

