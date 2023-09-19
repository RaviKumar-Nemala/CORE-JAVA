

class _multi_param_in_catch
{
     public static void main(String[] args) {
          try
          {
               //throw new ArrayIndexOutOfBoundsException();
               throw new NullPointerException();
              
          }
          catch ( ArrayIndexOutOfBoundsException  | NullPointerException cc)
//imp : inside of this parameters no inheritance relation presented like catch(Exception | RuntimeError | ArryaIndexOutOfBoundException  excp)  //invalid
          {
              cc.printStackTrace();//according to the raised exception here it prints the data
          }    
     }
}