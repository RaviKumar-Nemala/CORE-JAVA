class Loan 
{ 

    
      float intrestRate()
     {
          return 3.0f;
     }

}

class NormalLoan extends Loan{
     //WHEN EVER WE NEED TO IMPLEMENT THE NEW FUNCTIONALITY THEN ONLY WE NEED TO OVER RIDE THE SUPER CLASS EXISTED METHOD
     //here if i don't want to override the intrestRate which has the bank is given then i don't need to declare the method  again.
     protected float intrestRate()
     {
          return super.intrestRate();
     }
}
class HouseLoan extends Loan
{
     protected float intrestRate()
     {
          return 3.3f; //old functionaly is replaced with the new functionality based on the requiremet we have override it
     }
}
class StudyLoan extends Loan
{
     float intrestRate(){
          return 3.1f;
     }
}

class GoldLoan extends  Loan
{

     float intrestRate()
     {
          return 3.7f;
     } 
}

class VehicleLoan extends Loan
{
     float intrestRate( )
     {
          return 3.8f;
     }

     
}
/*
sub class return type same as the super class return type  
if we are preforming the method over loading and the parameter list of the  super class and the sub class is same
if they are not same then the compiler will rise an error
*/


public class Method_Override_3 {
 public static void main(String[] args) throws Exception {
        

}
}
