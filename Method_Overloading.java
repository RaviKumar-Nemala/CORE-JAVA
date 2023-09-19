class Test
{
     void add(int i , int j )
     {
          System.out.println(i + "  "+ j );
     }
     void add(float a , float b )
     {
          System.out.println(a + "  "+ b );

     }
     void add(String a, String b )
     {
          System.out.println(a + "  "+ b );

     }
     void add(char a , char b )
     {
          System.out.println(a + "  "+ b );

     }

     /*
     void check()
     {

     }    //not method overloading it is an error
     int check()    
     {
          return 1;
     }
     */
}    


public class Method_Overloading {
     
     public static void main(String[] args) {
          
          Test obj  = new Test();
          obj.add(1,2);
          obj.add(0.1f , 0.3f);//must declare the f at the end other wise it becomes as the double
          obj.add('a' , 'b');
          obj.add("first " , "Second");

          // IF WE SPECIFY THE SAME METHOD NAME AND THE SAME PARAMENTERS LIST BUT THE DIFFERENCE IN THE RETURN TYPE THEN IT IS NOT CALLED AS THE METHOD OVERLOADING IT WILL PRODUCEC THE ERROR IF WE DECLARE THOSE METHODS IN THE SAME CLASS
     }
}
