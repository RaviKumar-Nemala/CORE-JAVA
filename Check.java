package INTRODUCTION;
public class Check
{
     int i_Val  = 10 ;

     Check()
     {
          System.out.println("constructor of the check class");
          i_Val = 40;
     }
     public void set_Val(int i )
     {
          this.i_Val = i;
     }
     public void  print_Val()
     {
          System.out.println("value : " +i_Val);
     }
}
