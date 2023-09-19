

class Box 
{

     int length ;

     int width ; 

     int height ; 

     public Box ( int length  , int width , int height  )
     {
          this.length   = length  ; 
           
          this.width =  width ; 


          this.height = height ;

     }

     void findVolume ( )
     {

          System.out.println ( " PRINTING THE VOLUME OF THE BOX : "  + ( length * width  * height));
     }


     void firstNFab ( int n )
     {

          int a = 0 ; 
          int b  = 1 ;
          int c ; 
          
          while ( n >  0)
          {

               System.out.println( a );

               c = a +  b ;
                
               a = b ; 

               b = c ;

               n--;

          }

     }
}
public class temp_1 {
     

     public static void main(String[] args) {
          Box b = new Box( 1 ,2 , 3);

          b.findVolume();

          b.firstNFab (  3 );
     }
     
}
