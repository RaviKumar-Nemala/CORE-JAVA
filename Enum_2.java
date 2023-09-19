enum Apple //it is possible to declare the constructors inside of the enum class here is the syntax
{
     A(100) , B(200) , C("hello"); //inside of the square brackets are the constructors 
     int price ;
     String msg;
     Apple(int i )
     {
          this.price = i;
     }
     Apple(String s) //for C variable constructor overloading is possible inside of this
     {
          this.msg = s;
     }    
     int getPrice()
     {
          return this.price;
     }
     String getMsg()
     {
          return msg;
     }
}

public class Enum_2 {

     public static void main(String args[])
     {
          System.out.println(Apple.A.getPrice() + " " +Apple.B.getPrice() +" " +Apple.C.getMsg());
     }
}
