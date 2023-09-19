package INTRODUCTION;
public class var_args {
     
     static void add( double decimal  , int ch , int ...a) //here first va
     {
       System.out.println(decimal +" " +ch + " ");
          for (int  i : a)
          {
               System.out.println(i);
          }
     }
     public static void main(String args[])
     {
          add( 1 ,  2, 3  ,  5  , 6);
     }
}
