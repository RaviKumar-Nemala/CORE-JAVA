import java.util.*;

class Obj_Test 
{
     int id ;
     String name ;
     Obj_Test( int id, String name)
     {
          this. id =  id ;
          this.name =  name ;
     }
     @Override 
     public String toString( )
     { 
          return id + " " + name ;
     }
}

class Main_Cls 
{
     public static void main ( String args[])
     {
          List< Obj_Test> my_list = new ArrayList<>();
          my_list.add( new Obj_Test( 1 , "ravi"));
          my_list.add(  new Obj_Test( 2 , "kumar"));

          Iterator< Obj_Test> iter = my_list.iterator();

          while ( iter.hasNext() )
          {
               Obj_Test  obj =  iter.next();
               obj.id =  556 ;
          }

          System.out.println( my_list.toString() );
     }
}