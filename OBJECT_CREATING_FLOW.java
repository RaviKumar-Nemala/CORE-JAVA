package INTRODUCTION;
class Atm
{

     float balance =  0.0f;   
     String name ;


      Atm(String s)
     {
          this.name = s;
     }
     
     void withdrawl(float temp)
     {
          if(this. balance <  temp)
          {
               System.out.println("faluer transaction");
               return;
          }
          else
          {
               System.out.println("success");
               this.balance  -= temp;
               return;
          }
          
     }
     void deposit( int dep_amt)
     {
          this.balance += dep_amt;
          return ;
     }
     void print_Details( )
     {
          System.out.println("NAME : " + this.name  + " BALANE : " +balance);
          return;
     }
}

public class OBJECT_CREATING_FLOW
{
     public static void main(String args[])
     {
          Atm obj = new Atm("ravi kumar");
          obj.deposit(1000);
          obj.withdrawl(100);
          obj.print_Details();
          Atm atm_obj_2 = new Atm("DDOS ATTACKER");
          atm_obj_2.deposit(100);
          atm_obj_2.withdrawl(50); 
          atm_obj_2.print_Details();
     }
}