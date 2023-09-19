public class Command_Line_args {
 
     public static void main(String[] args) {
          
          
          int max_val  = Integer.MIN_VALUE ; 

          int temp =  0 ; 

          int min_val  =  Integer.MAX_VALUE;

          for (String arg :   args )
          {


               temp = Integer.parseInt (arg) ;
               
               if ( temp < min_val )
               {
                    min_val = temp ; 

               }

               if ( temp >  max_val )
               {
                    max_val =  temp ;
               }
          
          }

          System.out.println ( min_val   + "  " + max_val ) ;

       //   System.out.println(  a1   + "  "  +  a2  + "  " +  f1 +   "  "  + s1 );

          
     }

}
