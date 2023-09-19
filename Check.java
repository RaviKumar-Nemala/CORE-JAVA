import  java.util.*;
import java.util.function.*;


@FunctionalInterface
interface A 
{
     static int get_val ( )   
{
     return 1;
}
     
     void test () ;

}

@FunctionalInterface
interface C1< T extends Number>
{ 
     int  add ( T a ,  T  b );
     default void minus( T c , T d)
     { 
          int res = c.intValue()  - d.intValue();
          System.out.println ( res );
     }    
}

@FunctionalInterface
interface Calculator<T extends Number>
{
     T add( T a ) ; 
}

@FunctionalInterface
interface Calculator_2<T extends Number>
{
     T add( T a , T  b  , T c);
}

@FunctionalInterface
interface Calculator_3<T extends Number>
{ 
     T add( T a , T b , T  c , T d );
}

class CustomCls<T extends Number>
{
     void add(  Calculator<T> c1)
     {
          System.out.println ( "calculator one");
     }
     void add( Calculator_2<T> c2)    
     {
           System.out.println("calculator  two");
     }
     void add(  Calculator_3<T> c3) {
          System.out.println ( "calculator three");
     }

     void thread_check ()
     {
          System.out.println( "thread check " ) ;
     }
}

class Temp
{
     float thread_run(  )
     {
          System.out.println ( "called") ;
          // System.out.println ( a +  b ) ;
          return 1;
     } 

}


public class Check {
     public static void main( String args [] )
     {
          Integer i1 = 1 ;  
          Integer i2 = 2 ;

          C1<Integer> c1  = ( a , b ) -> a +  b ;
          
          System.out.println( c1.add( 1 , 2 ) );

          c1.minus(1 , 2 ) ;

          CustomCls cls = new CustomCls() ;;

          Calculator<Integer> cal1 = ( a ) -> a ;

          Calculator_2<Integer>  cal2 = (a ,b , c ) -> a  + b + c  ; 

          Calculator_3<Integer>  cal3  = (a , b , c , d ) ->   a +  b + c + d ;
          
          cls.add(cal1);
          cls.add ( cal2);
          cls.add( cal3);

          Runnable r =  ( ) ->
          {
               System.out.println( "implementation through lamda expr");
          };

          Thread  t1 =  new Thread(r); 

          Thread t2 = new Thread(( ) -> { System.out.println ( "t2 thread has invoked") ; }  );

          t1.start();

          t2.start ();

          Comparator<Integer> comp =  ( a , b )  -> 
          { 
               if ( a <= b) 
                    return -1;
               return 1 ;                                        
          };

          List<Integer> l1 = Arrays.asList ( 4 , 3 ,  2 , 1 );

          System.out.println ( l1.toString());

          Collections.sort(l1 , comp);
     
          System.out.println ( l1.toString ()) ;

          Function< Integer , String > f1  = ( a ) -> { return new String("hello");};
          
          Function < String , String  > f2  = ( a  ) -> a;

          l1.forEach( ele -> 
          {
               System.out.println( f1.andThen(f2).apply(ele) );
          });

          Temp temp   = new Temp ();
          A a  =  temp::thread_run;
          a.test( );
     }
}