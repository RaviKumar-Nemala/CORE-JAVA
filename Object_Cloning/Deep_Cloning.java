import java.lang.Cloneable;
class Account
{
     String acc_no ;
     String acc_type;
     Account(String acc_no ,  String acc_type)
     {
          this.acc_no = acc_no ; 
          this.acc_type = acc_type;
     }
}
class Employee implements Cloneable
{
     String emp_name ; 
     String emp_age ;

     Account account; 
     Employee(String emp_name , String emp_age , Account account)
     {
          this.account = account;
          this.emp_name =emp_name;
          this.emp_age = emp_age;
     }

     public Object clone()throws  CloneNotSupportedException
     {
          //IN THE SHALLOW CLONING ONLY THE EMPLOYEE OBJECT WILL BE DUPLICATED BUT THE ACCOUNT OBJECT IS SAME FOR THE BOTH ORIGINAL AND DUPLICATE OBJECTS 
          //IN THE DEEP CLONING BOTH EMPLOYEE AND THE ACCOUNT ARE TO BE DUPLICATED AND THE DIFFERNT REFERNCE VALUES ARE CREATED 
          Account acc = new Account(account.acc_no , account.acc_type);
          Employee obj =  new Employee(this.emp_name , this.emp_age , acc);
          return obj; 
     }

     void details()
     {
          System.out.println("EMP_ NAME  = " + emp_name);
          System.out.println("EMP_ AGE   =  " +emp_age);
          System.out.println("___________  ACCOUNT DETAILS _____");
          System.out.println("ACC _ NO   =  " +account.acc_no );
          System.out.println("ACC _  TYPE = " +account.acc_type);
     }    

}
public class Deep_Cloning {
     
     public static void main(String args[])throws Exception
     {    
          Account a = new Account("1234", "Sbi");
          Employee original = new Employee("ravi "  , "19" , a);
          Employee duplicate = (Employee)original.clone();
     
          original.details();
          duplicate.details();
     
          System.out.println("ORIGINAL OBJECT REF_VAL = " +original);
          System.out.println("DUPLICATE OBJECT REF_VAL = " +duplicate);
          //ORIGINAL OBJECT AND THE DUPLICATE OBJECT REF_VALUES ARE DIFFERENCT BUT THE ACCOUNT TYPE IS SAME THIS TYPE OF CLONING IS CALLED AS THE SHALLOW CLONING
          
          System.out.println("original ACCOUNT REF_VAL "  +original.account);
          System.out.println("DUPLICATE ACCOUNT REF_VAL " +duplicate.account);
     
     }    
}
