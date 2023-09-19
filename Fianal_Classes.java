//FINAL CLASSES CANNOT SUPPORT FOR THE INHERITANCE 
final class F1
{
     F1()
     {
          System.out.println("F1");
     }
     int a = 33;
     void change()
     {
          this.a = 31;
     }
}
//class F2 extends F1 //it is an error because of the final classes
//{

//}

/*
class F1
{

}
final class F2 extends F1 //it is not an error if this class becomes the parent class for any of the sub class then it is error
{
     //final class may be the child class to some normal super class but it should not be the super class for any of the child class
}*/




public class Fianal_Classes {
public static void main(String args[])
{
     F1 obj = new F1();
     System.out.println(obj.a);
     obj.change();
     System.out.println(obj.a);

}     

}
