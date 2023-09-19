import java.lang.Cloneable;
class Account implements Cloneable
{
     String name;
     int age;
     Account(String name  ,  int age)
     {
          this.name = name ; 
          this.age =  age;
     }
     void display()
     {
          System.out.println("NAME : " +name +"AGE  :"  +age);
     }
     //it will create the duplicate object which consists the data of the called object
     public Object clone() throws CloneNotSupportedException{
               //Object obj = super.clone();
               //return obj;
               return super.clone();
     }
}


public class Object_clone {     
     public static void main(String[] args) throws Exception{
          Account originalObj = new Account("RAVI " ,  19);
          Object  obj =  originalObj.clone();
          Account duplicateObj = (Account)obj;//assigning the duplicate ref value to the duplicate object ref variable
          originalObj.display();
          duplicateObj.display();
          System.out.println("ORIGINAL OBJECT REF_VAL = " +originalObj);
          System.out.println("DUPLICATE OBJECT REF_VAL = " +duplicateObj);
          duplicateObj.age = 99; //this change not reflected on to the original obj
          originalObj.display();
          duplicateObj.display();


              //PHASE 2
          Account a1 = new Account("kumar" , 18);
          Account a2 = a1; //it is also duplicate but the changes made in one obj reflected on the another obj
          a2.age = 44;
          a1.display();
          a2.display();
     }

}
