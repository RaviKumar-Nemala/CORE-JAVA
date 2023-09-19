package INTRODUCTION;
class Check{
     static Check a = null;
     public Check()
     {
     }
     static Check getRef()
     {
          if(a == null )
          a = new Check();
          return a;
     }
}

public class Singleton_Classes {
     public static void main(String args[])
     {
          Check f1 = Check .getRef();
          Check  f2 = Check.getRef();
          Check f3 = Check.getRef();

          System.out.println(f1 +"  " +f2 +"   " + f3);
     }
}
 