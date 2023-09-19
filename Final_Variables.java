


public class Final_Variables {

     final int i = 44;
     final int j ;
     Final_Variables()
     {
          j = 55;//declared in the above and initializing first of all here so no error occurs
          //i = 55; // final variables does not allow the data modification  so it is error
     }
     int getVal()
     {
          return i;
     }
public static void main(String args[])
{
     Final_Variables obj = new Final_Variables();
     System.out.println(obj.getVal());
}
}
