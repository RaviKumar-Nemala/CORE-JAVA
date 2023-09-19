
class T1
{
     static int s = 1;
     int normal_var = 1;
     int get_Val()
     {
          s++;
         return s; 
     }
     int get_Normal_Var()
     {
          normal_var ++;
          return normal_var;
     }
}


public class Static_Variables {
     
     public static void main(String args[])
     {
          T1 obj =  new T1();
          T1 obj_2 = new T1();
          

          //IN STATIC VARIABLES ONLY SINGLE COPY WILL BE CREATED THAT COPY WILL BE SHARED BY ALL THE OBJECTS IN THE CLASS
          //these static variales are not created on the heap only on to the method 
          //these variables are created during the byte code loading into the memory
          System.out.println("for the object 1 static variable");
          for(int i = 0 ;i < 3 ; i++)
          {
               System.out.println(obj.get_Val());
          }

          System.out.println("for the object 1 static variable");
          for ( int i = 0; i< 3  ;i ++)
          {
               System.out.println(obj_2.get_Val());
          }

          System.out.println("for the object 1 NORMAL variable");

          for ( int i = 0 ;i < 3 ;i ++)
          {
               System.out.println(obj.get_Normal_Var());
          }
          System.out.println("for the object 1 NORMAL variable");

          for( int i = 0 ; i < 3 ;i ++)
          {
               System.out.println(obj.get_Normal_Var());
          }


          obj = null;
          System.out.println("ACCESSING THE STATIC VARIABLES WITH THE NULLPOINTER REFERNCE TO THE REFERENCE VARAIBLE");
          System.out.println(obj.s);
          // it is not possible to access the normal instance variables with the nullptr reference value
          System.out.println("accessing static varaibles using the class name:");
          System.out.println(T1.s);
     }
}
