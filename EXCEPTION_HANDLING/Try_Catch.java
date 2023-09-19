
public class Try_Catch
{
     public static void main(String[] args) {
          try
          {
               var temp  = new int [10];
               System.out.println(temp[11]);

          }
          catch (ArrayIndexOutOfBoundsException a)
          {
               a.printStackTrace();//it provides both exception name and decriptionn and also the location of the exception
               System.out.println(a);//it does not provides the exception location 
               System.out.println(a.getMessage());// it only provides the exception description not exception name or the location
          }
     }
}