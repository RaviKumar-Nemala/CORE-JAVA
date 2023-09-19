
//ABSTAC CLASS AND INNER CLASS IS ALSO ABSTRACT CLASS
abstract class Outer  
{

abstract class Inner
{
     void Inner_method()
     {

     }
     abstract void m1();//must provide the implementation in the same outer class
     abstract void m2();
}

class Child extends Inner{
     void m1()
     {

     }
     void m2()
     {

     }
}

}

class Second extends Outer
{

}
public class Abstract_Inner3 {
     
public static void main(String[] args) {
     Outer.Inner oi =  new Second().new Child();
     //up casting principle we are able to assign the child object to the parent ref_var 
     //second class is child to the Outer class
     //child class is child to the Inner class
     oi.m1();
     oi.m2();
     oi.Inner_method();//not possible to access the child class own methods with the help of the parent ref_val

}
}
