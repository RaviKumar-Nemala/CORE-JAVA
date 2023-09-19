class Account
{
     int acc_no;
     int balance ;
     String name;
     Account()
     {

     }
     public Account(int acc_no , int balance , String name)
     {
          this.acc_no = acc_no;
          this.balance = balance;
          this.name = name;
     }
     boolean withdraw(int amount)
     {
          if(amount > balance )
          {
               return false;
          }
          else
          {
               this.balance -= amount;
               return true;
          }
     }
}
//OUR OWN EXCEPTION CLASS IS HERE MUST EXTEND FROM EXCEPTIOON 
class InsufficientTransaction extends Exception
{
     InsufficientTransaction(String temp)
     {
          super(temp);//
     }
}

class Account_Helper extends Account
{
     Account_Helper(int acc_no , int balance , String name)
     {
          super(acc_no , balance , name);
     }

     void withdraw_Util(){
     try
     {
          java.util.Scanner sc = new java.util.Scanner(System.in);
          System.out.println("ENTER THE AMOUNT TO BE WITHDRAWL  : ");
          int t_amount = sc.nextInt();
          boolean res =  withdraw(t_amount);
          if(res == true)
          {
               System.out.println("TRANSACTION SUCCESSFUL");
          }
          else
          {
               throw new InsufficientTransaction("INSUFFICIENT  FUNDS IN YOUR ACCOUNT");
          }
     }
     catch (InsufficientTransaction ist)
     {
         // ist.printStackTrace();//for full exception details 
          System.out.println(ist.getMessage());//for only exception description
     }
     finally
     {
          System.out.println("*********THAKS FOR VISITING**********");
     }
}
}

public class part_1 {
     public static void main(String[] args) {

          Account_Helper ah = new Account_Helper(11, 10, "hello");
          ah.withdraw_Util();
     }
}
