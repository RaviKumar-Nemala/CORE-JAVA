//SUPER CLASS METHOD IS NOT BE THE FINAL METHOD (don't use the final keyword)
//BECAUSE FINAL MEHTODS RESTICT THE CODE REUSABILITY
class Parent
{
     final void m1()
     {

     }
     void m2()
     {

     }
}

class Child extends Parent 
{
     /*
          final void m1( ) //THIS IS ERROR
          {

          }
          */
     /*
          void m1()
          {
                    //THIS IS ERROR
          }
          */
     final void m2() //no error becuse of the parent class should not be the final method sub class over riden method may or maynot be the final method
     {

     }
}
class G_Child extends Child 
{
     /*
     final void m2() ERROR : PARENT CLASS METHOD MUST NOT BE THE FINAL METHOD
     {

     }
     */
}
public class Method_Overiding_4 {
     
}
