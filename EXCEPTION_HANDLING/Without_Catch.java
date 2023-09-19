import java.io.IOException;
class A
{
void access(){
try
{
     int i =1;
     int j =0;
     int k = i/j;
     System.out.println("after the raised exception in try");
}
finally 
{
     System.out.println("FINALLY BLOCK");
   //  throw new IndexOutOfBoundsException();
}
System.out.println("NORMAL STATEMENTS AFTER FINALLY BLOCK");
//the above statement is not exectued because of the exception has raised in the try block
//since there is not catch block so the exception is caught by the default exception handler in the jvm
//and finall block is executed after finally block program is terminated
}
}
class Without_Catch
{
     public static void main(String[] args) throws Exception{
          A obj =new A();
          obj.access();
}    
}